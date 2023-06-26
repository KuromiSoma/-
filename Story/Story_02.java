package Story;

import java.util.Scanner;
import character.SuperMonster;
import java.util.Random;

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
    System.out.println("埼玉県に来た！何もなかった！");
    System.out.println("GAMEOVER");
}

public static void s2_2() {

    sb = new SuperMonster("キングスライム", 30, 5, 15, 10);
    System.out.println(sb.name + "が現れた！");
    System.out.println("【戦闘開始】");
    System.out.println("Enterキーを押して次に進んでください");
    scanner.nextLine(); // Enterキーが押されるまで待機

    boolean validInput01 = false; // 1か2を入力させるため

    while (!validInput01) {

     if(Story_01.h.speed >= sb.speed) {
        // こっちから攻撃のs2_2_aを呼ぶ
        s2_2_a();
        validInput01 = true;
     }else{
        // あっちから攻撃のs2_2_bを呼ぶ
        s2_2_b();
        validInput01 = true;
     }
     }

}

public static void s2_2_a() {

    boolean validInput02 = false; // 1か2を入力させるため

            while (!validInput02) {

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

                            System.out.println(Story_01.h.name + "は経験値を 25 獲得した！");
                            Story_01.h.Experience(25);

                            validInput02 = true; // 敵を倒すとtrueに設定してループを終了
                        }else{
                            System.out.println(sb.name + "の残りHP" + sb.hp);
                            System.out.println(sb.name + "の攻撃をどう受ける？");
                            System.out.println("");

                            Random random = new Random();

                            System.out.println("1:横に飛んで回避 2:後ろに飛んで回避");
                            System.out.println("");

                            boolean validInput3 = false; // 1か2を入力させるため

                            while(!validInput3) {

                                int choice04 = scanner.nextInt(); // 入力を受け取る

                                int randomNumber1 = random.nextInt(2) + 1; // 1から2までのランダムな数値を生成

                                if(choice04 == randomNumber1){
                                    System.out.println("攻撃を回避した！");
                                    validInput3 = true;
                                }else{
                                    System.out.println("攻撃を喰らった！");
                                    Story_01.h.hp -= sb.attack;
                                    System.out.println(Story_01.h.name + "の残りHP" + Story_01.h.hp);
                                    System.out.println("");
                                    validInput3 = true;
                                }
                                }

                                }

                    case 2: // 逃げる場合
                        validInput02 = true; // trueに設定してループを終了

                        System.out.println(Story_01.h.name + "は逃げ出した。");

                        scanner.nextLine(); // Enterキーが押されるまで待機

                        System.out.println("");
                        break;

                    
                    default:
                        System.out.println("再度入力してください");
                        break;
                    }
                    }

                    

                }
            

public static void s2_2_b() {

    boolean validInput4 = false;

    while(!validInput4) {

        System.out.println(sb.name + "の攻撃をどう受ける？");
        System.out.println("");
    
        Random random = new Random();
    
        System.out.println("1:横に飛んで回避 2:後ろに飛んで回避");
        System.out.println("");

        boolean validInput5 = false;

        while(!validInput5) {
    
        int choice5 = scanner.nextInt(); // 入力を受け取る

        int randomNumber2 = random.nextInt(2) + 1; // 1から2までのランダムな数値を生成
        
        switch (choice5) {

            case 1:
            case 2:
            if(choice5 == randomNumber2){
                System.out.println("攻撃を回避した！");
            }else{
                System.out.println("攻撃を喰らった！");
                Story_01.h.hp -= sb.attack;

                if(Story_01.h.hp > 0){
                System.out.println(Story_01.h.name + "の残りHP" + Story_01.h.hp);
                System.out.println("");
                }else if(Story_01.h.hp <= 0){
                System.out.println(Story_01.h.name + "は倒れた！");
                System.out.println("ゲームオーバー");
                }
            }
            validInput5 = true;
            break;

            default:
            System.out.println("再度入力してください");
            break;

        }

        }

        
        System.out.println(Story_01.h.name + "のターン");
        System.out.println("1:攻撃 2:逃げる");
        System.out.println("");

        int choice04 = scanner.nextInt(); // 入力を受け取る
        scanner.nextLine();

           switch (choice04) {
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

                            System.out.println(Story_01.h.name + "は経験値を 25 獲得した！");
                            Story_01.h.Experience(25);

                            validInput4 = true; // 敵を倒すとtrueに設定してループを終了
                        }else{
                            System.out.println(sb.name + "の残りHP" + sb.hp);
                        }

                    case 2: // 逃げる場合
                        validInput4 = true; // trueに設定してループを終了

                        System.out.println(Story_01.h.name + "は逃げ出した。");

                        scanner.nextLine(); // Enterキーが押されるまで待機

                        System.out.println("");
                        break;

                    
                    default:
                        System.out.println("再度入力してください");
                        break;
                    }

    }

}
}


