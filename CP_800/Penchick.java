import java.util.*;
public class Penchick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int ans = 0;
            int arr[] = new int[51];
            for(int i=0;i<n;i++){
                arr[sc.nextInt()]++;
            }
            for(int el:arr){
                ans=Math.max(ans,el);
            }
            ans = n-ans;
            
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
