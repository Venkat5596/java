
package com.sks.javaIO;


import java.io.FileReader;


public class ReadUsingFileReader {
    public static void main(String[] args) {

        try {


            FileReader fr = new FileReader("15.JAVA IO Assignment/fis.txt");

            int i;

            while ((i = fr.read()) != -1) {

                System.out.print((char) i);
            }

            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
