// меняет регистр в строке на строчные буквы

public class Main {

    public static String toLowerCase(String s){
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(toLowerCase(s));
    }
}