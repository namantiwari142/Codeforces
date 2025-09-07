import java.util.*;
import java.io.*;
import java.math.BigInteger;


public class Collatz {
   

    static class FastInput {
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

        public BigInteger nextBigInteger() throws IOException {
            return new BigInteger(next());
        }

        public int[] readArray(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = nextInt();
            return arr;
        }
    }

 
    public static void main(String[] args) throws IOException{

        FastInput in=new FastInput();

        int n= in.nextInt();
        
        ArrayList<int[]> ls= new ArrayList<>();

        for(int i=0;i<n;i++){
            int[] arr= in.readArray(2);
            ls.add(arr);
        }
        for(int i=0;i<ls.size();i++){
            
            int[] arr=ls.get(i);

            int k=arr[0];
            int x=arr[1];

            for(int j=0;j<k;j++){
                
                x=x*2;
    
            }
            System.out.println(x);

        }

    }
}
