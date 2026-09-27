import java.util.Arrays;

public class class_with_massive {

    public void sort(int[] arr) {
        privateSort(arr);
    }
    public int findMax(int[] arr) {
        return privateFindMax(arr);
    }
public int findIndex(int[] arr,int value) {
        return privateFindIndex(arr,value);
}
private void privateSort(int[]arr){
    if (arr == null || arr.length == 0) {
        System.out.println("Массив пуст,Сортировать нечего");
        return;
    }
Arrays.sort(arr);
    }
private int privateFindMax(int[]arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив пуст,максимум не найти");
        }
int max = arr[0];
        for (int num :arr) {
            if (num > max) {
                max = num;
            }
        }
    return max;
    }
private int privateFindIndex(int[] arr,int value) {
        if(arr == null) {
            return -1;
        }
for (int i =0;i < arr.length; i++) {
    if(arr[i] == value) {
        return i;
    }
}
    return -1;
    }

    public static void main(String[] args) {
        class_with_massive worker = new class_with_massive();
        int[] numbers = {5, 2, 9, 1, 7, 9};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        worker.sort(numbers);
        System.out.println("После сортировки: " + Arrays.toString(numbers));

        System.out.println("Максимум: " + worker.findMax(numbers));

        System.out.println("Индекс числа 7: " + worker.findIndex(numbers, 7));
        System.out.println("Индекс числа 9: " + worker.findIndex(numbers, 9));
        System.out.println("Индекс числа 100: " + worker.findIndex(numbers, 100));
    }
}




