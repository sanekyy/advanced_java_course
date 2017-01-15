package edu.technopolis.homework;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by ihb on 06.01.17.
 */

public class MyIO {

    public static FastScanner getInByFile() {
        return new FastScanner();
    }

    public static PrintWriter getOutByFile() {
        return new PrintWriter(new OutputStreamWriter(System.out));
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
