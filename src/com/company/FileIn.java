package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIn {

    String fname;

    public FileIn() {
        this.getFileName();
        this.readFileContents();
    }

    public void readFileContents() {
        boolean looping;
        DataInputStream in;
        String line;
        int j, len;

    /* Read input from file and process. */
        try {
            in = new DataInputStream(new FileInputStream(fname));
            looping = true;
            while (looping) {
                if (null == (line = in.readLine())) {
                    looping = false;
                    in.close();
                } else {
                    System.out.println("line = " + line);
                    j = 0;
                    len = line.length();
                    for (j = 0; j < len; j++) {
                        System.out.println("line[" + j + "] = " + line.charAt(j));
                    }
                }
            } /* End while. */
        } /* End try. */
        catch (IOException e) {
            System.out.println("Error " + e);
        } /* End catch. */
    }

    public void getFileName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name please:");
        fname = in.nextLine();
        System.out.println("You entered " + fname);
    }
}
