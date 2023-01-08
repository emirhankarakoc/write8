public class Main {
    public static void main(String[] args) {
//indisleri bosaltmak yerine, sadece dolu indisleri yazdiricam.
        String board[][]= new String[5][3];

        board[0][0] = "8 ";
        board[0][1] = " 8 ";
        board[0][2] = " 8 ";

        board[1][0] = "8 ";
        board[1][1] = "   ";
        board[1][2] = " 8 ";


        board[2][0] = "8 ";
        board[2][1] = " 8 ";
        board[2][2] = " 8 ";

        board[3][0] = "8 ";
        board[3][1] = "   ";
        board[3][2] = " 8 ";

        board[4][0] = "8 ";
        board[4][1] = " 8 ";
        board[4][2] = " 8 ";





for (int i = 0;i<5;i++){
    for(int j = 0;j<3;j++){
        System.out.print(board[i][j]);
    }
    System.out.println();
}
    }}