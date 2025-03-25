// считает квадратный корень из числа

public class Main {

    public static int mySqrt(int n) {
        int ans = 0;
        for(long i = 1; i <= (long)n; i++){
            if(i * i <= (long)n){
                ans = (int)i;
            }
            else{
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}