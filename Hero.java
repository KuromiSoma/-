public class Hero {
    String name;
    int hp;
    int attack;
    int speed;
    
    Hero(String a, int b, int c, int d){
        name = a;
        hp = b;
        attack = c;
        speed = d;
    }
    
    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した");
    }

    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は、" + "秒座った。");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    public void run(){
        System.out.println(this.name + "は、逃げ出した");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした。");
    }
}