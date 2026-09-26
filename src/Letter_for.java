import java.util.Scanner;

public class Letter_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите букву: ");
        char letter = scanner.next().charAt(0);

        if (letter == 'a' || letter == 'o' || letter == 'y' || letter == 'i' || letter =='e'|| letter == 'u' ) {
         System.out.println("Это гласная буква");
        } else {
            System.out.println("Это гласная буква");

        }

    }
}