//https://practice.geeksforgeeks.org/problems/arraylist-operation/1

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ArraylistOperations {
    private static ArrayList<Character> insert(ArrayList<Character> arr, char c){
        arr.add(c);
        return arr;
    }
    private static int frequency(ArrayList<Character> arr, char c){
        int freq = 0;
        Collections.sort(arr);
        return arr.lastIndexOf(c)-arr.indexOf(c)+1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //no of test cases
        int query = Integer.parseInt(br.readLine().trim());
        while(query-->0){
            //no of inputs
            int inputs = Integer.parseInt(br.readLine().trim());

            //declare arraylist
            ArrayList<Character> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            while (inputs-->0){
                while(st.hasMoreTokens()){
                    //take the operation-> i:insert f:frequency
                    String operation = st.nextToken();
                    String element = st.nextToken();
                    if(operation.equalsIgnoreCase("i")){
                        arr = insert(arr, element.charAt(0));
                    }else{
                        if(arr.contains(element.charAt(0)))
                            System.out.println(frequency(arr, element.charAt(0)));
                        else
                            System.out.println("Not Present");
                    }
                }
            }
        }
    }
}
