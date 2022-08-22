// This is the file containing the code for the UI part of a square on the board.


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.UnsupportedEncodingException;
import java.lang.String;
import java.nio.charset.Charset;

public class ChessSquareUI extends JLabel implements MouseListener {

    char coordinateX;
    int coordinateY;
    String pieceName;

    public ChessSquareUI(int row, int column) {
        // This line takes the int and associates it with the corresponding char character from the ascii table.
        // We want to have a1 be at the bottom left.
        coordinateX = (char) (row + 97);
        coordinateY = 8 - column;
        pieceName = String.valueOf("\u2654");
        //String noName = "\u2654";

        // Now the goal is to turn this into a label.
        // We first start by giving the square a color.
        if ((coordinateX + coordinateY)%2 == 0) {
            this.setBackground(Color.LIGHT_GRAY);

        }
        else {
            this.setBackground(Color.WHITE);
        }

        this.setOpaque(true);

        // Then we give it a piece located in the middle of the square.
        this.setVerticalAlignment(0);
        this.setHorizontalAlignment(0);
        this.setFont(new Font(Font.MONOSPACED,Font.PLAIN, 80));
        this.setText(pieceName);
    }

    // These lines are related to the implementation of the MouseListener interface which lets us control
    // what happens when we mouse click over the lable.
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
