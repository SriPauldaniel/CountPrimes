import java.util.*;
public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSol(n));
        sc.close();
    }

    static int findSol(int n) {
        if(n == 0) {
            return 0;
        }
        boolean flag = true;
        int count = 0;
        for(int i=2;i<=n;i++) {
            flag = true;
            for(int j=2;j<i;j++) {
                if(i%j == 0 && j != 1 ) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }
        return count;
    }
}
