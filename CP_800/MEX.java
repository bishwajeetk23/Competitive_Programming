import java.util.*;
public class MEX {
    public static int helper(int arr[], int n){
        int i=0;
        int j=n-1;
        int cnt=0;
        while(i<n && arr[i]==0){
            i++;
        }
        while(j>=0 && arr[j]==0){
            j--;
        }
        if(i>j)return 0;
        if(i==j)return 1;
        
        while(i<=j){
            if(arr[i]==0 || arr[j]==0)cnt++;
            i++;
            j--;
        }
        if(cnt==0)return 1;
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=helper(arr,n);
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
