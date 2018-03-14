package Special_series_sum;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GKG {
    public static void main(String[] args)throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        solve sol = new solve();
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());

            int sum = 0;

            for(int i = 1; i<=n; i++){
                sum+=sol.solver(2*i-1);
            }

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
class solve{
    public int solver(int n){
        if(n<=0)
            return 0;
        else{
            return n+solver(n-2);
        }
    }
}