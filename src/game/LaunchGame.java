package game;

class TicTacToe{

    char[][] board;

    public TicTacToe(){
       board = new char[3][3];
       initBoard();
    }

    void initBoard(){

        for (int i=0; i<board.length; i++){

            for (int j=0; j< board[i].length; j++){
                    board[i][j] = ' ';
            }
        }
    }

    void displayBoard(){
        System.out.println("-------------");

        for (int i=0; i<board.length; i++){

            System.out.print("| ");
            for (int j=0; j<board[i].length; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int col, char marks){

        if (row >= 0 && row <= 2 && col >= 0 && col <= 2){
            board[row][col] = marks;
        }else {
            System.out.println("Invalid Position");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        //t.displayBoard();
        t.placeMark(1, 2, 'X');
        t.placeMark(0,1,'O');
        t.displayBoard();
    }
}
