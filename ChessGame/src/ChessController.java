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




//---the code and variable---//
import java.util.ArrayList;

public class ChessController
{

    private ChessBoardModel board;

//---type of game---//
    public ChessController() {
        board = new ChessBoardModel();
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
    //*switch case for state (white /black)

                                    //---timer section---//
    //1 when right is given anable timer for the player in question
    //*all this prob via switch case
    //2 when player lose right disable timer
    //??idk how to do a timer and even less how to put it in the ui




                                    //---section possible move---//

    public ArrayList<ChessSquareModel> LegalMove(Position position,)
    {// making sure the code still work/not change much existing code


        //-controler ask the spot whitch piece it have (null, white or blanck)
        ChessABSPieceModel piecex = board.getSquareModel(position).getPiece();


        //-checking if it is the color of the player than enter equation
        //-if its a null piece or not the color of the in the selection do nothing
        if (/*player color*/ = !this.colour.equals(destSquare.getPiece(piecex).colour)
        {
            //-controler ask the piece what are is legal move
            //*make sure to deny the loop by asking position (should be in the piece part)
            //**controler need to check what are the legal move whitin the list of possible move
            //***checking if other piece are in the way -----(supposed to be in pieces side)
            ArrayList<ChessSquareModel> listOfMovesT = piecex.getListMoves( board.getSquareModel(position));

            /* function that check special case*/

            //?? idk if i put the part that check if the move put our own king in check here or in the move piece section

            //-send to the highliter which square are possible
            (/* function that highlite*/)(listOfMovesT)
                //prob gone be listOfMovesT add img redCircle something around those line



                //-appel de la fonction moving pour deplacer la piece apres(in progress)
                MovePiece(Position position2,)

        }
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

            //-create the move temporairly
            //starting square=a squareToGo=b  and create tempoarySquare=c(order important)
            //whit this put b in c and a in b and add a nullPiece in a
            //this allow us to make a tempoary move so its possible to undo the move fonction to make later
            //and allow to check if the king of the player that just move a piece is now in check and undo the move
            //??but for this i wonder if its better of to create variable where i store the info of the piece
            //??or if i create a square that dont have position(so it cant be interact by the player)
            //?? and use that square for every move


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
