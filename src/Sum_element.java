public class Sum_element {
    public static void main(String[]args){

        int[] array = {5,10,6,8,2,4,3};

        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0;i < array.length; i ++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
                int difference = sumEven - sumOdd;

                System.out.println("Сумма на четных местах: "+ sumEven);
                System.out.println(" Сумма на нечетных местах:" + sumOdd);
                System.out.println("Разница:"+ difference);}
        }


