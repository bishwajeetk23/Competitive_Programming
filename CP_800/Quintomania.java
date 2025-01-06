import java.util.*;
public class Quintomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            boolean flag=false;
            int prev = 0;
            for(int i=0;i<n;i++){
                if(i==0){
                    prev=sc.nextInt();
                    continue;
                }
                int temp = sc.nextInt();
                if(!(Math.abs(temp-prev)==5 || Math.abs(temp-prev)==7)){
                    flag = true;
                }
                prev=temp;
            }
            String ans = "YES";
            if(flag)ans = "NO";
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
