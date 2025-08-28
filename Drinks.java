//day 27 teachers day Challange

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juices  = sc.nextInt();
        double totalOrangePart = 0; 
    
        
        for(int i=0; i<juices; i++){
            double orangePercentage = sc.nextDouble();
            totalOrangePart += orangePercentage;
        }

        totalOrangePart = totalOrangePart/100;

        double result = (totalOrangePart/juices) * 100;
        System.out.printf("%.12f\n",result);

        sc.close();

    }
    
}
