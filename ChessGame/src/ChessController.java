// This will be the class in charge of controlling the game, this includes the player's turn, if the king is in check
// and moving the pieces. Debating on if this class moves the pieces itself.




//planing so i dont get lost -choco

//---section turn checker/switching---//

//1 start of game give right to player white to allow him to move/check his option
//2 when piece is move remove right for the player who had them and give it to next player
//*switch case for state (white /black)
//3 when right is given anable timer for the player in question
//4 when player lose right disable timer


//---start of turn---//

// check if ur in check
//check were the king



import java.util.ArrayList;

public class ChessController
{

    private ChessBoardModel board;


    public ChessController() {
        board = new ChessBoardModel();
        // Input here the board game mode? Or maybe add a function down the line that can do this but with more
        // options.
    }







                                        //---section possible move---//

    public ArrayList<ChessSquareModel> LegalMove(Position position,)
    {//1 making sure the code still work/not change much existing code


        // controler ask the spot whitch piece it have (null, white or blanck)
        ChessABSPieceModel piecex = board.getSquareModel(position).getPiece();


        //checking if it is the color of the player than enter equation
        //if its a null piece or not the color of the in the selection do nothing
        if (/*player color*/ = !this.colour.equals(destSquare.getPiece(piecex).colour)
        {
            // controler ask the piece what are is legal move
            //*make sure to deny the loop by asking position (should be in the piece part)
            //controler need to check what are the legal move whitin the list of possible move(should be in the piece part)
            //**checking if other piece are in the way -----(supposed to be in pieces side)
            ArrayList<ChessSquareModel> listOfMovesT = piecex.getListMoves( board.getSquareModel(position));

            //(need to add this but not now and idk how to do it to add later)
            // check special case (ex. promotion, rock,prim, 50 cout, ...)


            //(need to add this but not now and idk how to do it to add later)
            // checking if it put king in check(king getting atk)
            //** checking if king already atk then aloying move than block the check


            //(not obligated) send to the highliter which square are possible
            (/* function that highlite*/)(listOfMovesT)
                //prob gone be listOfMovesT add img redCircle something around those line





            //---section moving---//


            //i think im missing the way to get the second square
            public ArrayList<ChessSquareModel> MovePiece(Position position2,)
            {//2 via mouse listender get info whitch square got click then store it(supossed to be done higher up)

            //3 check if it was one of the move that was possible
            // (if no clear the memory who store which square if yes next step)
                if (position2 != position && position2 == listOfMovesT)
                {
                    // controler ask the spot whitch piece it have (null, white or blanck)
                    ChessABSPieceModel piecex = board.getSquareModel(position).getPiece();

                    if(/*color*/= !this.colour.equals(destSquare.getPiece(piecex).colour)
                    {
                        //4 send to board remouve piece from x square
                        //5 send to board add piece to y square
                        //6 send to turn checker move has been done

                    }

                }
            }
        }


    }






}
