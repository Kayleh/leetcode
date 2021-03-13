package src.lambda.thread.project;

import java.io.File;

/**
 * @Author: Kayleh
 * @Date: 2020/11/20 0:27
 */
public class TestThread
{
    public static void search(File file, String search)
    {
        if (file.isFile())
        {
            if (file.getName().toLowerCase().endsWith(".java"))
            {
                new searchFileThread(file, search).start();
            }
        }
        if (file.isDirectory())
        {
            File[] files = file.listFiles();
            for (File f : files)
            {
                search(f, search);
            }
        }
    }

    public static void main(String[] args)
    {
        File folder = new File("e:\\project");
        search(folder, "Magic");
    }
}
