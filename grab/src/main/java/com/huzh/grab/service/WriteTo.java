package com.huzh.grab.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author huzh
 * @date 2020/7/2 9:46
 */
public class WriteTo {

    private static String filePath = "D://个人文件/小说/";
    private static String suffix = ".txt";

    public static void writeTo(String content, String TXTName) throws IOException {

        File file = new File(filePath + TXTName + suffix);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.append(content);
        bw.flush();
        bw.close();
    }
}