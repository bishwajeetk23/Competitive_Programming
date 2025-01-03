
import java.util.Scanner;

public class Hard_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = 0;
            int rem=0;
            if(a>=m){
                ans+=m;
            }else{
                ans+=a;
                rem += m-a;
            }
            if(b>=m){
                ans+=m;
            }else{
                ans+=b;
                rem += m-b;
            }
            if(rem>0){
                if (rem>=c) {
                    ans+=c;
                }else{
                    ans+=rem;
                }
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
