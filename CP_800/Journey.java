import java.util.*;
public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int s = a+b+c;
            int ans = (n/s)*3;
            s = n%s;
            if(s!=0){
                ans++;
                s-=a;
            }
            if(s>0){
                ans++;
                s-=b;
            }
            if(s>0){
                ans++;
                s-=c;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
