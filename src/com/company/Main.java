package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\"));
            String tx;
            while (!(tx=br.readLine()).equals("stop")){
                System.out.println(tx);
                bw.write(tx + "/n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
