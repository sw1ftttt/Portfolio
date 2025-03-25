// прибавляет единицу работая с элементами массива как с целым числом

import java.util.Arrays;

public class Main {

    public static boolean checkOnlyNine(int[] digits){
        int count = digits.length - 1;
        while (count >= 0){
            if (digits[count] != 9){
                return false;
            }
            count --;
        }
        return true;
    }

    public static int[] plusOne(int[] digits){
        if (digits[digits.length - 1] != 9){
            digits[digits. length - 1] += 1;
            return digits;
        }
        else if (checkOnlyNine(digits)){
            int[] answer = new int[digits.length + 1];
            answer[0] = 1;
            return answer;
        }
        int count = digits.length - 1;
        while (digits[count] == 9 && count > 0){
            digits[count] = 0;
            if (digits[count - 1] != 9){
                digits[count - 1] += 1;
                return digits;
            }
            count --;
        }
        return null;
    }

    public static void main(String[] args) {
        int [] digits = {8, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}