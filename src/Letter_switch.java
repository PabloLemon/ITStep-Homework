import java.util.Scanner;
public class Letter_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите букву: ");
        char letter = scanner.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'o':
            case 'u':
            case 'e':
            case 'y':
                System.out.println("Это гласная буква");
                break;
            default:
                System.out.println("Это согласная буква");
        }
    }
}
