// считает сумму чисел побочной и главной диагонали в матрице

public class Main {

    public static int diagonalSum(int[][] mat){
        int res = 0;
        for (int i = 0; i < mat.length; i ++){
            for (int j = 0; j < mat.length; j ++){
                if (i == j || j == (mat.length - 1) - i){
                    res += mat[i][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(matrix));
    }
}