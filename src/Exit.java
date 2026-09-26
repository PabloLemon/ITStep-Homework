import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите exit для выхода из цикла: ");

        while (true) {
            String in = scanner.nextLine();

            if (in.equals("exit")) {
                System.out.println("Вы вышли из цикла");
                break;
            }
                System.out.println("Вы велли не корректные данные");
            }
        }
    }

