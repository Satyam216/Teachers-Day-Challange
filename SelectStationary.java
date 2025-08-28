import java.util.*;

class Solution{

    static int factorial(int value){
        int fact = 1;
        for(int i=1; i<=value; i++){
            fact *= i;
        }
        return fact;
    }
    public int ways(int N, int M, int P, int E){
        int numOfWays_pencil = factorial(N) / (factorial(N-P) * factorial(P));
        int numOfWays_Eraser = factorial(M) / (factorial(M-E) * factorial(E));
        return numOfWays_pencil * numOfWays_Eraser;
    }
}

public class SelectStationary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        int E = sc.nextInt();

        Solution ob = new Solution();
        int result = ob.ways(N,M,P,E);

        System.out.println(result);
        
    }
}