package com.sks.javaIO;

import java.io.*;

public class ReadUsingBufferedInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("bos.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }

            bis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
