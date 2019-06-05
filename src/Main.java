import javax.swing.*;

public class Main {

    public static void main(String []args){

        Spielfeld feld = new Spielfeld();
        feld.setSize(600, 600);
        feld.setLayout(null);
        feld.setName("TicTacToe");
        feld.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        feld.setVisible(true);

    }
}
