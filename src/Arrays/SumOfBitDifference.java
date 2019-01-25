//https://practice.geeksforgeeks.org/problems/sum-of-bit-differences/0
package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfBitDifference {
    private static int bitDifference(int a, int b) {
        int difference = 0;
        if (a == b)
            return difference;
        //convert both nubers in binary digits
        String b1 = Integer.toBinaryString(a);
        String b2 = Integer.toBinaryString(b);

        //swap the bigger and smaller value
        if (b > a) {
            String temp = b1;
            b1 = b2;
            b2 = temp;
        }
        int differenceInLength = b1.length() - b2.length();
        for (int i = 0; i < differenceInLength; i++) {
            b2 = "0" + b2;
        }
        for (int i = b2.length() - 1; i >= 0; i--) {
            if (b1.charAt(i) != b2.charAt(i))
                difference++;
        }
        return difference;
    }

    private static int bitDifferenceHelper(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum += bitDifference(arr[i], arr[j]);
            }
        }
        return 2 * sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (testCases-- > 0) {
            int arrayCount = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[arrayCount];
            int i = 0;
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            while (st.hasMoreTokens())
                arr[i++] = Integer.parseInt(st.nextToken().trim());
            sb.append(bitDifferenceHelper(arr) + "\n");
        }
        System.out.println(sb.toString());
    }
}
