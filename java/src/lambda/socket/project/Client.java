package src.lambda.socket.project;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 一旦建立了连接，就启动收发两个线程
 *
 * @Author: Kayleh
 * @Date: 2020/11/18 23:47
 */
public class Client
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("127.0.0.1", 8888);

            new SendThread(socket).start();
            new RecieveThread(socket).start();

        } catch (UnknownHostException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
