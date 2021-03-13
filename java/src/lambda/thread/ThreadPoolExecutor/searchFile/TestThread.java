package src.lambda.thread.ThreadPoolExecutor.searchFile;

import java.io.File;

public class TestThread
{

    static ThreadPool pool = new ThreadPool();

    public static void search(File file, String search)
    {

        if (file.isFile())
        {
            if (file.getName().toLowerCase().endsWith(".java"))
            {
                searchFileTask task = new searchFileTask(file, search);
                pool.add(task);
            }
        }
        if (file.isDirectory())
        {
            File[] fs = file.listFiles();
            for (File f : fs)
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