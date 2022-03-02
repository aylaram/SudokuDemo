package sudoku.userinterface;

import sudoku.problemdomain.SudokuGame;

public interface IUserInterfaceContract {
    interface EventListner{
        void onSudokuGInput(int x, int y, int input);
        void onDialogClick();

    }

    interface View{
       void setListener(IUserInterfaceContract.EventListner listner);
       void updateSquare(int x, int y, int input);
       void updateBoard(SudokuGame game);
       void showDialog(String message);
       void showError(String message);
    }
}
