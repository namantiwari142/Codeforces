package myutils;

import java.io.*;
import java.util.*;

public class FastInput {
    private BufferedReader br;
    private StringTokenizer st;

    public FastInput() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }

    public long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }

    public int[] readArray(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = nextInt();
        return arr;
    }
}
