package com.sks.javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferedReader {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sirig\\OneDrive\\Documents\\corejava\\out\\production\\15.JAVA IO Assignment\\bw.txt"))) {
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
