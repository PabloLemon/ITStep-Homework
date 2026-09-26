import java.util.Scanner;

public class Seasons {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String month = scanner.nextLine();

        switch (month) {
            case "Декабрь":
            case"Январь":
            case"Февраль":
                System.out.println("Зима");
                break;
            case"Март":
            case"Апрель":
            case"Май":
        System.out.println("Весна");
        break;
            case"Июнь":
            case"Июль":
            case"Август":
                System.out.println("Лето");
                break;
            case"Сентябрь":
            case"Октябрь":
            case"Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяа нет");
        }

    }
}

