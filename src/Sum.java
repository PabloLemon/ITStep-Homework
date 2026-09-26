import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);

        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) ;
            sum += i;
        }
        System.out.println("Сумма " + min +" до "+ max +",которые делятся на 3,равна: "+ sum);
      }
    }

