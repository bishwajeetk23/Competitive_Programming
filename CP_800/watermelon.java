import java.util.*;
public class watermelon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        String s = "NO";
        if(w!=2 && w%2==0)s="YES";
        System.out.println(s);
        sc.close();
    }
}