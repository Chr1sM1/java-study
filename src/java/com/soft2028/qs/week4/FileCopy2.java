package com.soft2028.qs.week4;

import java.io.*;
import java.util.UUID;

/**
 * @ClassName FileCopy2
 * @Description TODO
 * @Author Chris
 * @Date 2020/10/29
 **/
public class FileCopy2 {
    public static void main(String[] arg) throws IOException {
        //1：将源文件读入内存数组
        File file1 = new File("c:/Users/Chris/Pictures/Saved Pictures/333.txt");
        try (Reader is = new FileReader(file1)) {
            char[] ff=new char[(char)file1.length()];
            int readResult=is.read(ff);
            String s=new String(ff,0,readResult);
            System.out.println(s);
            //2：将内存数组中的值写到目标文件中
            File file2 = new File("c:/Users/Chris/Pictures/Saved Pictures/" + UUID.randomUUID().toString() + ".txt");
            Writer os = new FileWriter(file2);
            os.write(ff);
            os.close();
            is.close();
        }
    }
}
