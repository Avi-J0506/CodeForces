import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b = sc.next();
            
            StringBuilder sb1 = new StringBuilder(a);
            StringBuilder sb2 = new StringBuilder(b);

            char temp = sb1.charAt(0);
            sb1.setCharAt(0, sb2.charAt(0));
            sb2.setCharAt(0, temp);
            
            System.out.println(sb1.toString() + " " + sb2.toString());
        }

        sc.close();
    }
}
