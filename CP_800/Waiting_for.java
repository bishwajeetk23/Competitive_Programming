import java.util.*;
public class Waiting_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt((sc.nextLine()));
        long total_people=0;
        while(n!=0){
            String event = sc.next();
            int num = sc.nextInt();
            sc.nextLine();
            if (event.equals("P")) {
                total_people += num;
            }else{
                String ans = "";
                if(total_people < num){
                    total_people=0;
                    ans = "Yes";
                }else{
                    total_people -= num;
                    ans = "NO";
                }
                System.out.println(ans);
            }
            n--;
        }

    }
}
