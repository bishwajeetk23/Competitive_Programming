import java.util.*;
public class Greedy_Monocorp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            long sum=0;
            for(int i=n-1;i>=0;i--){
                if(sum+arr[i]>k)break;
                sum+=arr[i];
            }
            System.out.println(k-sum);
            t--;
        }
        sc.close();
    }
}