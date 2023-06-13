public class Hero {
    String name;
    int hp;

    Hero(String a, int b){
        name = a;
        hp = b;
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