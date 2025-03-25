// переставляет нули в массиве на последние места

import java.util.Arrays;

public class Main {

    public static void moveZeroes(int[] nums){
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == 0){
                for (int j = i; j < nums.length; j ++){
                    if (nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        i ++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}