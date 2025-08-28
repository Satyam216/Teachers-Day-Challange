//teacher's day challenge day 13

import java.util.*;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < str.length(); i += 2) {
            nums.add(str.charAt(i) - '0');
        }

        Collections.sort(nums);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums.size(); i++) {
            res.append(nums.get(i));
            if (i != nums.size() - 1) {
                res.append('+');
            }
        }

        System.out.println(res.toString());
    }
}
