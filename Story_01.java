import java.util.Scanner;

public class Story_01 {

    public static void s0(){
    System.out.println("あなたの名前を入力してください");
    Scanner scanner = new Scanner(System.in);
    String heroName = scanner.next();

     // 勇者を召喚
    Hero h = new Hero("勇者"+heroName, 100, 25, 30);

    System.out.println(h.name + "を生み出しました。");
    System.out.println(h.name + "のHPは" + h.hp + "です");
    System.out.println(h.name + "の攻撃力は" + h.attack + "です");
    System.out.println(h.name + "のHPは" + h.speed + "です");

    // 行き先を選ぶ
    System.out.println("どこへ向かおうか？");
    System.out.println("1:魔物の森 2:綺麗な川");
    
    boolean validInput01 = false; // 1か2を入力させるため

    while (!validInput01) {

        Scanner scanner2 = new Scanner(System.in);
        int choice02 = scanner2.nextInt(); // 入力を受け取る

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
    Monster sa = new Monster("スライムA", 30, 5, 15);
    System.out.println(sa.name + "が現れた！");

    }

    public static void s1_2(){
    //　釣りを始める
    System.out.println("川釣りをして魚をゲットしましょう");
    }

}