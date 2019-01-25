package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NearlySortedAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int query = Integer.parseInt(br.readLine().trim());
        while(query-->0){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int arrayLength = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine().trim());

            //declare new array
            int[] arr = new int[arrayLength];
            int i = 0;
            while (st.hasMoreTokens()){
                arr[i++] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            for(i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
