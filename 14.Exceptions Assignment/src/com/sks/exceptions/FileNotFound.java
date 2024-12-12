package com.sks.exceptions;

import java.io.*;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            e.printStackTrace();
        }
    }
}
