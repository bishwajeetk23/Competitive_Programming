import java.util.*;
public class preparing_olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for(int i=0;i<n;i++){
                int b = sc.nextInt();
                if(i==0)continue;
                if(b<arr[i-1])ans+=arr[i-1]-b;
            }
            ans+=arr[n-1];
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
