import java.util.*;
public class startup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0) { 
            int n = sc.nextInt();
            int k = sc.nextInt();
            long ans = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
            for(int i=0;i<k;i++){
                int b = sc.nextInt();
                int c = sc.nextInt();
                map.put(b,map.getOrDefault(b, 0)+c);
            }
            for(Map.Entry<Integer,Integer> el:map.entrySet()){
                pq.offer(el.getValue());
            }
            while(n!=0 && !pq.isEmpty()){
                ans += pq.poll();
                n--;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
