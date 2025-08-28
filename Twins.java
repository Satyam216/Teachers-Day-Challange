// day 20 teachers day challange

import java.util.Scanner;
import java.util.Arrays;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        int currentSum = 0;
        int count = 0;
        for(int i=n-1; i>=0; i--){
            currentSum += arr[i];
            count++;
            if(currentSum > sum - currentSum){
                System.out.println(count);
                return; 
            }
        }

    }
}
