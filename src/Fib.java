import java.util.Scanner;
public class Fib {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько вывести чисел Фибоначчи?:");
        int n = scanner.nextInt();

        int[] fib = new int[n];

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                fib[i] = 0;
            }else if(i == 1) {
                fib[i] = 1;
            }else {
                    fib[i] = fib[i - 1] + fib[i -2];
                }
            }
                System.out.println("Числа Фибоначчи:");
            for(int i =0;i < n;i++){
            System.out.println(fib[i] + " ");
        }

    }
}
