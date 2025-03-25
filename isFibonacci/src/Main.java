// определяет является ли число числом Фиббоначчи

public class Main {

    public static boolean isFibonacci(long target){
        if (target == 0) return false;
        if (target == 1) return true;
        for (int i = 2; i < target; i ++){
            if (i + i - 1 == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(4));
    }
}