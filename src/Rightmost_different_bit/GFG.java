package Rightmost_different_bit;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GFG {
    public static void main(String[] args)throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());

            int a = Integer.parseInt(st.nextToken().trim());
            int b = Integer.parseInt(st.nextToken().trim());
            System.out.println(Integer.toBinaryString(a));
            System.out.println(Integer.toBinaryString(b));
            int c = (a^b)&-(a^b);
            String ans = Integer.toBinaryString(c);
            int size = ans.length();
            int position = 1;
            while(size-->0){
                if(ans.charAt(size)=='0'){
                    position++;
                }else{
                    break;
                }
            }

            sb.append(position).append("\n");
        }
        System.out.println(sb);
    }
}
