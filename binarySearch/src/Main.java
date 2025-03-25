// реализация бинарного и линейного поиска

public class Main {

    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i ++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left != right) {
            int middle = (left + right) / 2;
            if (arr[middle] < target) {
                left = middle + 1;
            }
            else if (arr[middle] > target){
                right = middle - 1;
            }
            else if(arr[middle] == target){
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr, 3));
        System.out.println(binarySearch(arr, 5));
    }
}