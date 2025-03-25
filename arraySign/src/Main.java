// определяет знак массива при перемножении его элементов, только без умножения

public class Main {

    public static int arraySign(int[] nums){
        int countOfNegativeElements = 0;
        for (int num : nums) {
            if (num < 0) {
                countOfNegativeElements++;
            }
            if (num == 0) {
                return 0;
            }
        }
        if (countOfNegativeElements % 2 == 0){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,-1};
        System.out.println(arraySign(nums));
    }
}