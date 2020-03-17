package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
       FileInputStream ips = null;
       File  f=new File("c://temp//java.txt");
        try {
            ips = new FileInputStream(f);
            InputStreamReader ir=new InputStreamReader(ips,"UTF-8");


                    int s;
            while ((s= ir.read())!=-1){
                System.out.print((char)s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            ips.close();
        }
    }
}
