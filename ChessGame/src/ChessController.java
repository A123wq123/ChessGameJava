// This will be the class in charge of controlling the game, this includes the player's turn, if the king is in check
// and moving the pieces. Debating on if this class moves the pieces itself.




//this section is crowded whit comment sorry if that bother but its for me(chocobeaver) to help orgenise things
//and ask my question so the code get better i have weird way to write that a comment and what that comment stand for
//so those are my way to write commentary-)

//(specification about somethings)
//---This Is A Title of a section of the code---//
//?? a question or a tought it mite be better to do it an other way
/* a short word that is a variable or function that i didnt create yet */
//- section that explain the function/variable/line below it self
//* this is for comment about sommething (and add an other star for each other comment on that subject)
//1(could be any num) this mean its part of a plan and chow the order



//---inner info idk were they are---//

//know the position of the king constantly and change when ever he is move
//*ask the board the king position




//---the code and variable---//
import java.util.ArrayList;


public class ChessController
{

    private Colour currentPlayer;
    private ChessBoardModel board;

//---type of game---//
    public ChessController() {
        board = new ChessBoardModel();
        currentPlayer = Colour.WHITE;
        // Input here the board game mode? Or maybe add a function down the line that can do this but with more
        // options.
    }


                                    //---section turn checker/switching---//

    //1 start of game give right to player white to allow him to move
    //??not sure yet how are we going to do this
    //2 when piece is move remove right for the player who had them and give it to next player
    //?? still not sure how prob gone me whit a switch case for turn and via mouse listender check
    //?? witch player click and verify if its his turn
    //(maybe gonna create a posibility to overload system whit info)
    //*switch case for state (white /black)and enum class

                                    //---timer section(ui side)---//
    //1 when right is given anable timer for the player in question
    //*all this prob via switch case of the player
    //2 when player lose right disable timer
    //??idk how to do a timer and even less how to put it in the ui
    //*It's basically only on the UI side, some of the model reacts to it but most of it is in UI.




                                    //---section possible move---//

    public ArrayList<ChessSquareModel> LegalMove(Position positionClicked)
    {// making sure the code still work/not change much of the existing code


        //-controler ask the spot whitch piece it has (null, white or blanck)
        ChessABSPieceModel piecex = board.getSquareModel(positionClicked).getPiece();


        //-checking if it is the color of the player who's turn it is, then enter equation
        //-if its a null piece or not the color do nothing or stop the move.
        if (CheckColour(piecex))
        {
            //-controler ask the piece what are is legal move
            //**controler need to check what are the legal move whitin the list of possible move
            ArrayList<ChessSquareModel> listOfMovesT = piecex.getListMoves( board.getSquareModel(positionClicked));

            /*function that check if king in check*/

            /* function that check special case and add them to list*/

            //?? idk if i put the part that check if the move put our own king in check here or in the move piece section

            //-send to the highliter which square are possible
            (/* function that highlite*/)(listOfMovesT)
                //prob gone be listOfMovesT add img redCircle something around those line



                //-appel de la fonction moving pour deplacer la piece apres(in progress)
                MovePiece(Position position2,)

        }
    }
                                      //---section Obtain colour of player--//
    /**
     * Get attribute currentPlayer from chess controler
     * @return Colour
     */
    private Colour getCurrentPlayer() { return currentPlayer; }

                                      //---section check colour player--//

    /**
     * Checks if the color of the piece is the same as the player who's playing
     * @return bool (y/n)
     */
    private boolean CheckColour (ChessABSPieceModel piece)
    {
        if (getCurrentPlayer() == piece.colour){

            return true;
        }
        return false;
    }


                    //---section temp move to check if ok---//

    //-create the move temporairly
    //starting square=a squareToGo=b  and create tempoarySquare=c(order important)
    //whit this put b in c and a in b and add a nullPiece in a
    //this allow us to make a tempoary move so its possible to undo the move fonction to make later
    //and allow to check if the king of the player that just move a piece is now in check and undo the move
    //??but for this i wonder if its better of to create variable where i store the info of the piece
    //??or if i create a square that dont have position(so it cant be interact by the player)
    //?? and use that square for every move

    /**
     * This method needs to check if a move is legal
     * @return bool (y/n)
     */

    private boolean CheckIfMoveLegal (Position currentPosition, Position destination)
    {
        // create c , c <-> b, a <-> c
        ChessSquareModel tempSquare = new ChessSquareModel(currentPosition.getCoordX(),currentPosition.getCoordY());


        return false;
    }


                                    //---section check if King is in check--//
    /**
     * Verifies if the king of the specified color is in check.
     * @return bool (y/n)
     */

    private boolean CheckKingCheck (Colour player)
    {
        return false;
    }


                                         //---section moving---//


    //??i think im missing the way to get the second square
    public ArrayList<ChessSquareModel> MovePiece(Position position2,)
    {//-via mouse listender get info whitch square got click then store it(supossed to be done higher up)

        //-check if it was one of the move that was possible
        //-(if no clear the memory who store which square if yes next step)
        if (position2 != position && position2 == listOfMovesT)
        {
            //-controler ask the spot whitch piece it have (null, white or blanck)
            ChessABSPieceModel piecex = board.getSquareModel(position).getPiece();




            //-send to turn checker move has been done
            //??need to check its theres a better way to send info that the turn is done than return.
            //??because as of rn i would send a boul variable for exemple W/B and add 1 and when the function
            //??to change the turn add 0 at the end to change turn but that sound wack
            //?? and a bad way to code this i wonder if a switch case would be better i dont think so for now



        }
    }




                                        //---special case---//
    //(need to add this but not now and idk how to do it to add later)
    // check special case (ex. promotion, rock,prim, 50 cout, ...)



}
