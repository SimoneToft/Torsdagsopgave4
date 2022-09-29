import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String name;
        int age;
        int retire;

        System.out.println("Type your name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Type your age");
        age = scanner.nextInt();
        System.out.println();
        retire = 67-age;
        System.out.println("You can retire in "+retire+" years");
    }
}
