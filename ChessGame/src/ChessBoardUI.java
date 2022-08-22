// This file is the code for the UI part of a chess board, this does NOT include the squares, they have their own
// class for this purpose.

import javax.swing.*;
import java.awt.*;

public class ChessBoardUI {

    // The canvas on which we will work to implement the UI.
    JFrame frame;
    int numberOfRows = 8;

    public ChessBoardUI() {
        frame = new JFrame(); // Create the JFrame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setTitle("ChessGame");

        // This makes it so the JFrame now obeys under the GridLayout Format (gives us a grid).
        frame.setLayout(new GridLayout(8, 8));

        // This will add the squares to the JFrame
        this.AddSquaresUI(frame);

        frame.setVisible(true); // Without this line the frame is not visible

        // The following two lines are to add a picture as the APP logo while running the code.
        // ImageIcon ChessAppImage = new ImageIcon("AppImage.png");
        // frame.setIconImage(ChessAppImage.getImage());

    }

    // This will add the squares to the JFrame
    public void AddSquaresUI(JFrame frame) {
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfRows; column++) {
                frame.add(new ChessSquareUI(row, column));
            }
        }
    }

    // the goal of this function will be to add the pieces to the UI. Issue is, I'm wondering if we add from here,
    // or if we should have the method (background code) be the one who decides where the pieces are.
    // EX: we check the method and if it says Tower then add tower on the square we are looking at.
    public void AddPieces(JFrame frame) {

    }

}
