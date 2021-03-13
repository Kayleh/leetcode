package src.lambda.socket.project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 一旦接受到连接，就启动收发两个线程
 *
 * @Author: Kayleh
 * @Date: 2020/11/18 23:46
 */
public class Server
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss = new ServerSocket(8888);

            System.out.println("监听在端口号:8888");
            Socket s = ss.accept();

            //启动发送消息线程
            new SendThread(s).start();
            //启动接受消息线程
            new RecieveThread(s).start();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
