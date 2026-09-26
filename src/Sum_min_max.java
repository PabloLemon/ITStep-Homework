import java.util.Scanner;
public class Sum_min_max {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    int[] array = {5,3,2,6,9,8,7};

    int min = array[0];
    int max = array[0];

    for(int i = 1; i < array.length; i++) {
        if (array [i] < min) {
            max = array[i];
        }
    }
    int sum = min + max;
    System.out.println("Минимум: "+ min);
    System.out.println("Максимум: "+ max);
    System.out.println("Сумма: "+ sum);
}
}
