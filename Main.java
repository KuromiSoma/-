public class Main {
    public static void main(String[] args) {
        // 勇者を召喚
        Hero h = new Hero("勇者Ａ", 100);
        System.out.println(h.name + "を生み出しました。");
        System.out.println(h.name + "のHPは" + h.hp + "です");
    }
}
