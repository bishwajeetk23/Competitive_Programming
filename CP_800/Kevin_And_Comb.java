import java.util.*;
public class Kevin_And_Comb {
    public static String solve(int num){
        if(num%33!=0)return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int num = sc.nextInt();
            String ans = solve(num);
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
