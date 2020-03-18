package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int f;
        try
                (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\write"));

                ){ String tx;
            while (!(tx=br.readLine()).equals("stop")){
              //  System.out.println(tx);
                bw.write(tx + "\n");
                bw.flush();

            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
