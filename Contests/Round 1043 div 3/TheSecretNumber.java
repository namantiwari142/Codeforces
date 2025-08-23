import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class TheSecretNumber {
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

        public BigInteger nexBigInteger() throws IOException {
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
        int t= in.nextInt();
        
        ArrayList<BigInteger> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            list.add(in.nexBigInteger());
        }
        

        //Main logic
        
        for(BigInteger num:list){
            //BigInteger n=new BigInteger(num);

            BigInteger ten=BigInteger.TEN;            
            BigInteger one=BigInteger.ONE;
            int k=num.toString().length();
            
            ArrayList<BigInteger> fin=new ArrayList<>();

            for(int i=1;i<k;i++){
                BigInteger powoften=ten.pow(i);           
                BigInteger divisor= one.add(powoften);        
                BigInteger result=num.remainder(divisor);

                
                
                // System.out.print("power"+" "+powoften);
                // System.out.print("divisor"+" "+divisor);
                // System.out.print("result"+" "+result);

                // System.out.print(n+" "+result+" "+divisor.divide(n));
                if(result.equals(BigInteger.ZERO)){
                    BigInteger res=num.divide(divisor);
                    fin.add(res);
                }
            }

            System.out.println(fin.size());
            Collections.sort(fin);
            for(BigInteger x:fin){
                System.out.print(x+" ");
            }
            if(fin.size()!=0) System.out.println();
        }
        
    }
}
