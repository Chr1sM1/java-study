package com.soft2028.qs.week4;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * @ClassName FileCopy
 * @Description 使用io流实现文件的复制
 * @Author Chris
 * @Date 2020/10/29
 **/
public class FileCopy {
    public static void main(String[] arg) throws IOException {
        //1：将源文件读入内存数组
        File file1 = new File("c:/Users/Chris/Pictures/Saved Pictures/333.txt");
        InputStream is = new FileInputStream(file1);
        byte[] b = new byte[(int)file1.length()];
        int readResult = is.read(b);
        System.out.println(Arrays.toString(b));
        System.out.println(readResult);
        //2：将内存数组中的值写到目标文件中
        File file2 = new File("c:/Users/Chris/Pictures/Saved Pictures/"+ UUID.randomUUID().toString()+".txt");
        OutputStream os = new FileOutputStream(file2);
        os.write(b);
        os.close();
        is.close();
    }
}
