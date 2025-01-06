import java.util.*;
public class Intercepted_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int k = sc.nextInt();
            int arr[] = new int[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();
            }
            int t_el = k-2;
            Arrays.sort(arr);
            int i=0;
            int j=k-1;
            while(i<j && arr[i]*arr[j]!=t_el){
                if(arr[i]*arr[j]>t_el)j--;
                else i++;
            }
            System.out.println(arr[i]+" "+arr[j]);
            t--;
        }
        sc.close();
    }
}
