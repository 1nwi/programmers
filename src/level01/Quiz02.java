package level01;

import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String star = "";
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                star += "* ";
            }
            star += "\n";
        }
        System.out.printf("%s",star);

    }
}
