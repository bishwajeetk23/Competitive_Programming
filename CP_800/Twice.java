import java.util.*;
public class Twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int map[] = new int[22];
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                map[sc.nextInt()]++;
            }
            int ans=0;
            for(int i=0;i<22;i++){
                ans += (map[i]/2);
            }
            System.out.println(ans);
            t--;
        }
    }
}
