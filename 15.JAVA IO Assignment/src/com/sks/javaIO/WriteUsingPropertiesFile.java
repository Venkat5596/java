/**
 * @author JALA Academy
 *
 * 10.Write a program to write data to properties file
 */
package com.sks.javaIO;

import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
    public static void main(String args[]) {

        try {

            Properties props = new Properties();

            props.put("Name", "SKS");
            props.put("E.no", "105");
            props.put("College", "ICFAI Tech");


            FileOutputStream outputStrem = new FileOutputStream("15.JAVA IO Assignment/pf.txt");

            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}