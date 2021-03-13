package src.lambda.BIO.BIO_Chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Kayleh
 * @Date: 2020/11/27 14:10
 */
public class ChatServer
{
    private int DEFAULT_PORT = 8888;
    private final String QUIT = "quit";
    private ServerSocket serverSocket;

    private Map<Integer, Writer> connectedClients;
    private ExecutorService executorService;

    public ChatServer()
    {
        this.connectedClients = new HashMap<>();
        this.executorService = Executors.newFixedThreadPool(10);
    }

    public synchronized void forwardMessage(Socket socket, String fwdMsg) throws IOException
    {
        for (Integer port : connectedClients.keySet())
        {
            if (!port.equals(socket.getPort()))
            {
                Writer writer = connectedClients.get(port);
                writer.write(fwdMsg);
                writer.flush();
            }
        }
    }

    public synchronized void addClient(Socket socket) throws IOException
    {
        if (socket != null)
        {
            int key = socket.getPort();
            Writer writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            connectedClients.put(key, writer);
            System.out.println("客户" + key + "已经连接");
        }
    }

    public synchronized void removeClient(Socket socket) throws IOException
    {
        if (socket != null)
        {
            int port = socket.getPort();
            if (connectedClients.containsKey(port))
            {
                connectedClients.get(port).close();
                connectedClients.remove(port);
            }
            System.out.println("客户端" + port + ":已经断开连接");
        }
    }

    public boolean readyToQuit(String msg)
    {
        return QUIT.equals(msg);
    }

    public void close()
    {
        if (serverSocket != null)
        {
            try
            {
                serverSocket.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void start()
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("聊天服务器已经成功启动!");
            while (true)
            {
                Socket socket = serverSocket.accept();

                executorService.execute(new ChatHandler(socket, this));
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            close();
        }
    }

    public static void main(String[] args)
    {
        ChatServer chatServer = new ChatServer();
        chatServer.start();
    }
}
