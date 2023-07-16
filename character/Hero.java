package character;
import java.util.Scanner;

public class Hero {
    public String name;
    public int maxHp;
    public int hp;
    public int attack;
    public int speed;
    public int EXP;
    
    public Hero(String a, int b, int c, int d, int e){
        this.name = a;
        this.maxHp = b;
        this.hp = c;
        this.attack = d;
        this.speed = e;

    }

    public void status(){
        System.out.println("ステータス");
        System.out.println(this.name);
        System.out.println("【ＨＰ】" + this.hp + " / " + this.maxHp);
        System.out.println("【攻撃力】" + this.attack);
        System.out.println("【スピード】" + this.speed);
    }

    public void Experience(int OriEXP){
        Scanner scannerh1 = new Scanner(System.in);
        EXP += OriEXP;
        System.out.println("増やしたいステータスを選択してください");

        boolean validInputEx1 = false; // 1か2か3を入力させるため

     while (!validInputEx1) {
        System.out.println("1 : 最大ＨＰ");
        System.out.println("2 : 攻撃力");
        System.out.println("3 : スピード");

        int whatUp = scannerh1.nextInt();
        scannerh1.nextLine();

        switch(whatUp){
            case 1:
            this.maxHp += EXP;
            System.out.println("最大ＨＰが" + this.EXP + "上がった！");
            validInputEx1 = true;
            break;

            case 2:
            this.attack += EXP;
            System.out.println("攻撃力が" + this.EXP + "上がった！");
            validInputEx1 = true;
            break;

            case 3:
            this.speed += EXP;
            System.out.println("スピード" + this.EXP + "上がった！");
            validInputEx1 = true;
            break;

            default:
            System.out.println("再度入力してください");
            break;
        }
     }

     status();

     System.out.println("Enterキーを押して次に進んでください");
        
     scannerh1.nextLine(); // Enterキーが押されるまで待機
     scannerh1.close();
     
    }


}