import java.util.*;

public class Normal_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t!=0){
            String a = sc.nextLine();
            StringBuilder st = new StringBuilder(a);
            int i=0;
            int j=a.length()-1;
            while(i<=j){
                char chi = st.charAt(i);
                char chj = st.charAt(j);
                if(chi=='q'){
                    chi='p';
                }else if(chi=='p')chi='q';

                if(chj=='q')chj='p';
                else if(chj=='p')chj='q';
                st.setCharAt(i, chj);
                st.setCharAt(j, chi);
                i++;
                j--;
            }
            System.out.println(st);
            t--;
        }
        sc.close();
    }
}