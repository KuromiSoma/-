package Story;

import java.util.Scanner;

import character.Hero;
import character.SuperMonster;

public class Story_02 {
    public static SuperMonster sb;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void s0() {

        System.out.println("どこへ向かおうか？");
        System.out.println("1:埼玉県 2:八王子市");

        boolean validInput01 = false; // 1か2を入力させるため

        while (!validInput01) {
            int choice01 = scanner.nextInt(); // 入力を受け取る
            scanner.nextLine();

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

    sb = new SuperMonster("キングスライム",200,40,60,30);
    System.out.println(sb.name + "が現れた！");

    while (Story_01.h.hp > 0 || sb.hp > 0) {

        boolean validInput01 = false; // 1か2を入力させるため
        boolean validInput02 = false;

        if (Story_01.h.speed >= sb.speed ) {
            System.out.println(Story_01.h.name + "の行動");
            System.out.println("");

            while (!validInput01) {

                System.out.println("1:攻撃 2:逃げる");
                System.out.println("");

                int choice03 = scanner.nextInt(); // 入力を受け取る
                scanner.nextLine();

                switch (choice03) {
                    case 1: // 戦う場合
                        System.out.println(Story_01.h.name + "の攻撃");
                        System.out.println("");
                        sb.hp -= Story_01.h.attack;
                        System.out.println(sb.name + "に" + Story_01.h.attack + "ダメージ");
                        System.out.println("");
                        if(sb.hp <= 0){
                            System.out.println(sb.name + "が倒れた");

                            System.out.println("Enterキーを押して次に進んでください");
                            scanner.nextLine(); // Enterキーが押されるまで待機

                            System.out.println(Story_01.h.name + "は経験値を 10 獲得した！");
                            Story_01.h.Experience(25);

                            validInput01 = true; // 敵を倒すとtrueに設定してループを終了
                        }else{
                            System.out.println(sb.name + "の残りHP" + sb.hp);
                            System.out.println(sb.name + "の攻撃をどう受ける？");
                            System.out.println("");

                            System.out.println("1:横に飛んで回避 2:後ろに飛んで回避");
                            System.out.println("");

                            boolean validInput3 = false; // 1か2を入力させるため

                            while(!validInput3) {

                                int choice04 = scanner.nextInt(); // 入力を受け取る

                                switch (choice04) {
                                    case 1:
                                        System.out.println(sb.name + "の攻撃をかわした！");
                                        System.out.println("");
                                        validInput3 = true;
                                        break;

                                    case 2:
                                        System.out.println(sb.name + "の攻撃をくらった！");
                                        Story_01.h.hp -= sb.attack;
                                        System.out.println(Story_01.h.name + "の残りHP" + Story_01.h.hp);
                                        System.out.println("");
                                        validInput3 = true;
                                        break;

                                    default:
                                        System.out.println("再度入力してください");
                                        break;
                                }
                            }
                        }
                        break;

                    case 2: // 逃げる場合
                        validInput01 = true; // trueに設定してループを終了

                        System.out.println(Story_01.h.name + "は逃げ出した。");

                        scanner.nextLine(); // Enterキーが押されるまで待機

                        System.out.println("");
                        break;

                    default:
                        System.out.println("再度入力してください");
                        break;
                }
      
        }

        } else {
            while  (!validInput02) {
                
            }

        }

}

public static void s2_2() {

}

}