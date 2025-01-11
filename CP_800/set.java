import java.util.*;
public class set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int ml = sc.nextInt();
            int mr = sc.nextInt();
            int k = sc.nextInt();
            long r = mr;
            long l = ml;
            long ans = 0;
            while(l<=r){
                long mid = l + (r-l)/2;
                if(mid*k>mr){
                    r=mid-1;
                }else{
                    ans=mid;
                    l=mid+1;
                }
            }
            if(ans!=0)ans = ans-ml+1;
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
