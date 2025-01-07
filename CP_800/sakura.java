import java.util.*;
public class sakura{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            String ans = "Kosuke";
            if(n%2==0)ans="Sakurako";
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}