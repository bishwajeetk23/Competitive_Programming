import java.util.*;
public class minimise_oneness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            StringBuilder st = new StringBuilder();
            for(int i=0;i<n-1;i++){
                st.append('0');
            }
            st.append('1');
            System.out.println(st);
            t--;
        }
        sc.close();
    }
}
