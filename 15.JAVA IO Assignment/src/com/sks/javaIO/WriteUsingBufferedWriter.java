
package com.sks.javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteUsingBufferedWriter {
    public static void main(String[] args) {

        String s = "This text is written using BufferedWriter.";

        try {


            FileWriter fw = new FileWriter("15.JAVA IO Assignment/bw.txt");

            BufferedWriter bw = new BufferedWriter(fw);

            //provides method to write string directly.
            bw.write(s);
            //closing FileWriter and BufferedWriter
            bw.close();
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}