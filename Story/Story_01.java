package Story;
import java.util.Scanner;

import character.Hero;
import character.Monster;

public class Story_01 {

    public static Hero h;
    public static Monster sa;
    public static Scanner scanner = new Scanner(System.in); 

    public static void s0() {
        System.out.println("あなたの名前を入力してください");
        String heroName = scanner.nextLine(); 

        // 勇者を召喚
        h = new Hero("勇者"+heroName, 100, 100, 25, 30);

        System.out.println(h.name + "を生み出しました。");
        System.out.println("【最大ＨＰ】" + h.maxHp);
        System.out.println("【攻撃力】" + h.attack);
        System.out.println("【スピード】" + h.speed);

        System.out.println("Enterキーを押して次に進んでください");
        scanner.nextLine(); // Enterキーが押されるまで待機

        // 行き先を選ぶ
        System.out.println("どこへ向かおうか？");
        System.out.println("1:魔物の森 2:綺麗な川");

        boolean validInput01 = false; // 1か2を入力させるため

        while (!validInput01) {


            int choice02 = scanner.nextInt(); // 入力を受け取る
            scanner.nextLine();
            

            switch (choice02) {
                case 1:
                    s1_1();
                    validInput01 = true; // 入力が正しい場合はvalidInput01をtrueに設定してループを終了
                    break;

                case 2:
                    s1_2();
                    validInput01 = true; // 入力が正しい場合はvalidInput01をtrueに設定してループを終了
                    break;

                default:
                    System.out.println("再度入力してください");
                    break;
            }

        }

    }



    public static void s1_1(){
        // スライムを召喚
        sa = new Monster("スライム", 30, 5, 15);
        System.out.println(sa.name + "が現れた！");
        System.out.println("【戦闘開始】");

        System.out.println("Enterキーを押して次に進んでください");
        scanner.nextLine(); // Enterキーが押されるまで待機

        if(h.speed >= sa.speed) {
            System.out.println(h.name + "の行動");
            System.out.println("");

            boolean validInput02 = false; // 1か2を入力させるため

            while (!validInput02) {

                System.out.println("1:攻撃 2:逃げる");
                System.out.println("");

                int choice03 = scanner.nextInt(); // 入力を受け取る
                scanner.nextLine();

                switch (choice03) {
                    case 1: // 戦う場合
                        System.out.println(h.name + "の攻撃");
                        System.out.println("");
                        sa.hp -= h.attack;
                        System.out.println(sa.name + "に" + h.attack + "ダメージ");
                        System.out.println("");
                        if(sa.hp <= 0){
                            System.out.println(sa.name + "が倒れた");

                            System.out.println("Enterキーを押して次に進んでください");
                            scanner.nextLine(); // Enterキーが押されるまで待機

                            System.out.println(h.name + "は経験値を 10 獲得した！");
                            h.Experience(10);

                            validInput02 = true; // 敵を倒すとtrueに設定してループを終了
                        }else{
                            System.out.println(sa.name + "の残りHP" + sa.hp);
                            System.out.println(sa.name + "の攻撃をどう受ける？");
                            System.out.println("");

                            System.out.println("1:横に飛んで回避 2:後ろに飛んで回避");
                            System.out.println("");

                            boolean validInput3 = false; // 1か2を入力させるため

                            while(!validInput3) {

                                int choice04 = scanner.nextInt(); // 入力を受け取る

                                switch (choice04) {
                                    case 1:
                                        System.out.println("攻撃を回避した！");
                                        System.out.println("");
                                        validInput3 = true;
                                        break;

                                    case 2:
                                        System.out.println("攻撃を喰らった！");
                                        h.hp -= sa.attack;
                                        System.out.println(h.name + "の残りHP" + h.hp);
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
                        validInput02 = true; // trueに設定してループを終了

                        System.out.println(h.name + "は逃げ出した。");

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

    public static void s1_2(){
        // 釣りを始める
        System.out.println("川釣りをして魚をゲットした！");
        System.out.println(h.name + "の最大HPが 10 増えた！" );
        h.maxHp += 10;
        h.hp += 10;
        h.status();
        System.out.println("");
        System.out.println("魔物の森へ移動します");
        System.out.println("Enterキーを押して次に進んでください");

        scanner.nextLine(); // Enterキーが押されるまで待機
        System.out.println("");
    }

}