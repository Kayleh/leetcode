package src.lambda.socket.project;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 发送消息线程
 * @Author: Kayleh
 * @Date: 2020/11/18 23:39
 */
public class SendThread extends Thread
{
    private Socket socket;

    public SendThread(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        try
        {
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            while (true)
            {
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                dos.writeUTF(str);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
