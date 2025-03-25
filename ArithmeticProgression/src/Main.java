// определяет можно ли составить из чисел массива арифметическую прогрессию

import java.util.Arrays;

public class Main {

    public static boolean canMakeArithmeticProgression(int[] arr){
        arr = Arrays.stream(arr).sorted().toArray();
        int increment = arr[0] - arr[1];
        for (int i = 0; i < arr.length - 1; i ++){
            if (arr[i] - arr[i + 1] != increment){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 4, 2};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}