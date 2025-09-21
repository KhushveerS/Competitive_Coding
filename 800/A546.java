//https://codeforces.com/problemset/problem/546/A
import java.util.*;
public class A546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        long n = sc.nextLong();
        int w=sc.nextInt();

        long totalcost=(long)k*((w*(w+1))/2);
        long borrow=totalcost-n;
        System.out.println(borrow>0?borrow:0);

    }
}
