import java.util.*;

public class LineBreak_2050A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLine().length();
            }
            int sum = 0;
            int ans = 0;
            for(int i=0;i<n;i++){
                if(sum+arr[i]<=m){
                    ans++;
                    sum+=arr[i];
                }else{
                    break;
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}