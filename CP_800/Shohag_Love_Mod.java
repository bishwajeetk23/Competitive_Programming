import java.util.*;
public class Shohag_Love_Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            for(int i=1;i<n+1;i++){
                System.out.print((2*i)-1 + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
