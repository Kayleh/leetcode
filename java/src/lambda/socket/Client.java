package src.lambda.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author: Kayleh
 * @Date: 2020/11/18 23:07
 */
public class Client
{
    public static void main(String[] args)
    {
        try
        {
            Socket s = new Socket("127.0.0.1", 8888);
            System.out.println(s);
            s.close();
        } catch (UnknownHostException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
