import java.util.Scanner;

public class Game_Division {
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
            boolean vis[] = new boolean[n];
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if((Math.abs(arr[i]-arr[j]))%k==0){
                        vis[i]=true;
                        vis[j]=true;
                    }
                }
            }
            boolean ans = false;
            for(int i=0;i<n;i++){
                if(vis[i]==false){
                    ans=true;
                    System.out.println("YES");
                    System.out.println(i+1);
                    break;
                }
            }
            if(!ans)System.out.println("NO");
            t--;
        }
    }
}
