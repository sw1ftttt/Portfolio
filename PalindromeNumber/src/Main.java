public class Main {

    public static boolean isPalendrome(int x){
        String str = "" + x;
        return str.equals(reversingStr(str));
    }

    public static String reversingStr(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(isPalendrome(21));
    }
}