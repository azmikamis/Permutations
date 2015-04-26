import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            permute(alpha.substring(0, l)).forEach(System.out::println);
        }
    }

    public static ArrayList<String> permute(String s) {
        ArrayList<String> res = new ArrayList<String>();
        if (s.length() == 1) {
            res.add(s);
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                ArrayList<String> temp = permute(String.format("%s%s", s.substring(0, i), s.substring(i + 1)));
                for (String x : temp) {
                    res.add(String.format("%s%s", s.charAt(i), x));
                }

            }
        }
        return res;
    }

}
