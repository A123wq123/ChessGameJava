// This is the file containing the code for the UI part of a square on the board.


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessSquareUI extends Label implements MouseListener {

    char coordinateX;
    int coordinateY;

    public ChessSquareUI(int row, int column) {
        // This line takes the int and associates it with the corresponding char character from the ascii table.
        // We want to have a1 be at the bottom left.
        coordinateX = (char) (row + 97);
        coordinateY = 8 - column;

        // Now the goal is to turn this into a label.
        if ((coordinateX + coordinateY)%2 == 0) {
            this.setBackground(Color.BLACK);
        }
        else {
            this.setBackground(Color.WHITE);
        }
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
