package Set_kth_bit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GFG {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int query = Integer.parseInt(br.readLine().trim());

        while(query-->0){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int no = Integer.parseInt(st.nextToken().trim());
            int k = Integer.parseInt(st.nextToken().trim());
            String s = Integer.toBinaryString(no);

            int lhs = s.length()-k-1;
            s = s.substring(0,lhs)+1+s.substring(lhs+1);

            int answer = Integer.parseInt(s,2);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
