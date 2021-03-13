package src.lambda.thread.ThreadPoolExecutor.searchFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: Kayleh
 * @Date: 2020/11/21 0:45
 */
public class searchFileTask implements Runnable
{
    private File file;
    private String search;

    public searchFileTask(File file, String search)
    {
        this.file = file;
        this.search = search;
    }

    @Override
    public void run()
    {
        String fileContent = readFileContent(file);
        if (fileContent.contains(search))
        {
            System.out.printf("线程: %s 找到子目标字符串%s,在文件:%s%n", Thread.currentThread().getName(), search, file);
        }
    }

    public String readFileContent(File file)
    {
        try (FileReader fr = new FileReader(file))
        {
            char[] all = new char[(int) file.length()];
            fr.read(all);
            return new String(all);
        } catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
