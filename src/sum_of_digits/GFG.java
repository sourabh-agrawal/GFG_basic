package sum_of_digits;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class GFG {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int query = Integer.parseInt(br.readLine().trim());
        while(query-->0){
            String no = br.readLine().trim();
            int position = no.length();
            int sum = 0;
            while(position-->0){
                sum+=(no.charAt(position)-'0');
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
