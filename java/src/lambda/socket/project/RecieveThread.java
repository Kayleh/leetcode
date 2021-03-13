package src.lambda.socket.project;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 接受消息线程
 *
 * @Author: Kayleh
 * @Date: 2020/11/18 23:43
 */
public class RecieveThread extends Thread
{
    private Socket socket;

    public RecieveThread(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        try
        {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true)
            {
                String msg = dis.readUTF();
                System.out.println(msg);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
