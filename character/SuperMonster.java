package character;
public class SuperMonster extends Monster {
    int MP;

    public SuperMonster(String name, int hp, int attack, int speed, int MP) {
        super(name, hp, attack, speed);
        this.MP = MP;
    }
}