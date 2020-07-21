package com.sf.effectivejava.item9;

import java.io.*;

public class TryWithResources {

    public static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();//If the finally block was executing during the handling of an earlier exception then that first exception is lost.
        }
    }

    //Multiple resources try-finally
    public static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[1000];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    //TODO Implement Try-with-resources
    public static String firstLineOfFileV2(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    //TODO Implement Try-with-resources
    public static void copyV2(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst);) {
            byte[] buf = new byte[1000];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
