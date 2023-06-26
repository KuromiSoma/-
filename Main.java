import Story.Story_01;
import Story.Story_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        Story_01 s1 = new Story_01();
        Story_02 s2 = new Story_02();

        scanner = s1.s0(scanner);
        s2.s0(scanner);
    }
}
