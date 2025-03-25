// определяет победителя в игре крестики нолики

public class Main {

    public static boolean checkForZeroesInMassive(int[][] resultPole){
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                if (resultPole[i][j] == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static int checkForDifferencesInMassive(int[] row){
        int constant = row[0];
        for (int element: row){
            if (constant != element){
                return 0;
            }
        }
        return constant;
    }

    public static int checkWinInRow(int[][] resultPole){
        for (int i = 0; i < 3; i ++){
            if (checkForDifferencesInMassive(resultPole[i]) != 0){
                return checkForDifferencesInMassive(resultPole[i]);
            }
        }
        return 0;
    }

    public static int checkWinInVerticalRow(int[][] resultPole){
        int[] firstColumn = {resultPole[0][0], resultPole[1][0], resultPole[2][0]};
        int[] secondColumn = {resultPole[0][1], resultPole[1][1], resultPole[2][1]};
        int[] thirdColumn = {resultPole[0][2], resultPole[1][2], resultPole[2][2]};
        if (checkForDifferencesInMassive(firstColumn) != 0){
            return checkForDifferencesInMassive(firstColumn);
        }
        if (checkForDifferencesInMassive(secondColumn) != 0){
            return checkForDifferencesInMassive(secondColumn);
        }
        if (checkForDifferencesInMassive(thirdColumn) != 0){
            return checkForDifferencesInMassive(thirdColumn);
        }
        return 0;
    }

    public static int checkWinDiagonal(int[][] resultPole){
        int[] mainDiagonal = {resultPole[0][0], resultPole[1][1], resultPole[2][2]};
        int[] secondDiagonal = {resultPole[0][2], resultPole[1][1], resultPole[2][0]};
        if (checkForDifferencesInMassive(mainDiagonal) != 0){
            return checkForDifferencesInMassive(mainDiagonal);
        }
        if (checkForDifferencesInMassive(secondDiagonal) != 0){
            return checkForDifferencesInMassive(secondDiagonal);
        }
        return 0;
    }

    public static int[][] massiveVisualisation(int[][] moves){
        int[][] resultPole = new int[3][3];
        for (int i = 0; i < moves.length; i ++){
            if (i % 2 == 0){
                resultPole[moves[i][0]][moves[i][1]] = 1;
            }
            else{
                resultPole[moves[i][0]][moves[i][1]] = 2;
            }
        }
        return resultPole;
    }

    public static String tictactoe(int[][] moves){
        if(checkWinInRow(massiveVisualisation(moves)) == 1 || checkWinDiagonal(massiveVisualisation(moves)) == 1 || checkWinInVerticalRow(massiveVisualisation(moves)) == 1){
            return "A";
        }
        if (checkWinInRow(massiveVisualisation(moves)) == 2 || checkWinDiagonal(massiveVisualisation(moves)) == 2 || checkWinInVerticalRow(massiveVisualisation(moves)) == 2){
            return "B";
        }
        if (checkForZeroesInMassive(massiveVisualisation(moves))){
            return "Pending";
        }
        else {
            return "Draw";
        }
    }

    public static void main(String[] args) {
        int[][] moves = {{2,0},{1,1},{0,2},{2,1},{1,2},{1,0},{0,0},{0,1}};
        System.out.println(tictactoe(moves));
    }
}