package Story;

import java.util.Scanner;

import character.Hero;
import character.SuperMonster;

public class Story_02 {
    Hero Hero2 = Story_01.h;
    public static SuperMonster sb;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void s0() {

        System.out.println("どこへ向かおうか？");
        System.out.println("1:埼玉県 2:八王子市");

        boolean validInput01 = false; // 1か2を入力させるため

        while (!validInput01) {
            int choice01 = scanner.nextInt(); // 入力を受け取る

            switch (choice01) {
                case 1:
                    s2_1();
                    validInput01 = true; // 入力が正しい場合はvalidInput01をtrueに設定してループを終了
                    break;

                case 2:
                    s2_2();
                    validInput01 = true; // 入力が正しい場合はvalidInput01をtrueに設定してループを終了
                    break;

                default:
                    System.out.println("再度入力してください");
                    break;
            }
        }

        scanner.close();

}

public static void s2_1() {

}

public static void s2_2() {
    
}

}