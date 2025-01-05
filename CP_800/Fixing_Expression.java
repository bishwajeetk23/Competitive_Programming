import java.util.*;
public class Fixing_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t!=0){
            String st = sc.nextLine();
            StringBuilder str = new StringBuilder(st);
            char exp = st.charAt(1);
            char fst = st.charAt(0);
            char sec = st.charAt(2);
            if(fst==sec){
                if(exp!='=')str.setCharAt(1, '=');
            }else if((fst-'0')>(sec-'0')){
                if(exp!='>')str.setCharAt(1, '>');
            }else{
                if(exp!='<')str.setCharAt(1, '<');
            }
            System.out.println(str.toString());
            t--;
        }
        sc.close();
    }
}
