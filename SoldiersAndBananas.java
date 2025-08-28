import java.util.Scanner;

public class SoldiersAndBananas {  //day 24 of teachers day challange
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();  //initial value of banana
        int n = sc.nextInt();   //total money the soldier has
        int w = sc.nextInt();   //number of banana he wants
        int cost = 0;
        int borrowedMoney = 0;

        for(int i=1; i<=w; i++){
            cost += k*i;
        }

        if(cost > n){
            borrowedMoney = cost - n; //money which he will buy from his friend
            System.out.println(borrowedMoney);
        }else{
            System.out.println(borrowedMoney);
        }
    }
    
}
