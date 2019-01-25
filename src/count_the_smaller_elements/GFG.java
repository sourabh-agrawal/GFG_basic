package count_the_smaller_elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GFG {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //no of test cases
        int query = Integer.parseInt(br.readLine().trim());

        while(query-->0){
            int size = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int[] array = new int[size];
            int i = 0;
            while(st.hasMoreTokens()){
                array[i] = Integer.parseInt(st.nextToken().trim());
                i++;
            }

            int search = Integer.parseInt(br.readLine().trim());
            i=0;
            int count=0;
            while(array[i]<=search){
                count++;
                i++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
