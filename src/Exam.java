import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите оценку:");
            int n = scanner.nextInt();
            if
            (n < 0 || n > 100) {
                System.out.println("Ошибка!Введите число от 0 до 100");
            } else if (n >= 100) {
                System.out.println("Отлично!(A)-Ты гений");
            } else if (n >= 75) {
                System.out.println("Хорошо(B)-Ты молодец");
            } else if (n >= 60) {
                System.out.println("Удовлетворительно(C)-Можно лучше");
            } else if (n >= 40) {
                System.out.println("Плохо(D)-Нужно подтянуть");
            } else {
                System.out.println("Неудовлетворительно(F)-Учи материал!");
            }
        }
    }
}
