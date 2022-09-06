// This will be the class in charge of controlling the game, this includes the player's turn, if the king is in check
// and moving the pieces. Debating on if this class moves the pieces itself. 

//planing so i dont get lost -choco

//---section turn checker/switching---//

//1 start of game give right to player white to allow him to move/check his option
//2 when piece is move remove right for the player who had them and give it to next player
//3 when right is given anable timer for the player in question
//4 when player lose right disable timer


//---section possible move---//

//1 making sure the code still work/not change much existing code
//2 controler is call wen we click on a piece(info sent by mouse listener)
//3 controler ask the spot if it has a piece if not cancel operation if yes go to next step
//4 controler ask the piece what are is legal move
//4* (getting the direction and the num of square)**make sure to deny the loop
//5 controler need to check what are the legal move whitin the list of possible move
//5-1 checking if other piece are in the way
//5-2 check special case (ex. prim, rock, ...)
//6 checking if it end the game(king getting atk)
//6-1 checking if king already atk then aloying move than block the check
//6-2 checking if by moving the piece it create new check
//8(not obligated) send to the highliter which square are possible

//---section moving---//

//1 check if a pice is selected
//2 via mouse listender get info whitch square got click then store it
//3 check if it was one of the move that was possible(if no clear the memory who store which square if yes next step)
//4 send to board remouve piece from x square
//5 send to board add piece to y square
//6 send to turn checker move has been done


public class ChessController {
    private ChessBoardModel board;

    public ChessController() {
        board = new ChessBoardModel();
        // Input here the board game mode? Or maybe add a function down the line that can do this but with more
        // options.
    }


}
