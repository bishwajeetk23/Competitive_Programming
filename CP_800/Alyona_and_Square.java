import java.util.*;
public class Alyona_and_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int ans=0;
            long sum=0;
            long layer=8;
            for(int i=0;i<n;i++){
                int d = sc.nextInt();
                if(i==0){
                    if(d==1)
                        ans++;
                    else{
                        d--;
                        sum+=d;
                    }
                    continue;
                }
                sum+=d;
                while((sum)>=layer){
                    sum -= layer;
                    layer += 8;
                }
                if(sum==0)ans++;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
