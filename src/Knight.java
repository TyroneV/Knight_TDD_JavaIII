public class Knight extends ChessPiece{

    public Knight(ChessBoard chessBoard) {
        super(chessBoard);
    }

    @Override
    public boolean moveTo(int x, int y) {
        y = y*-1;
        if(validMove(x, y)){
            if(chessBoard.setChessPiece(this,x,y)){
                return true;
            }
            else {
                System.out.println("Invalid Move!");
                return false;
            }
        }
        else {
            System.out.println("Invalid Move!");
            return false;
        }
    }

    @Override
    public boolean validMove(int x, int y){
        if((x == getxCoords()-2||x == getxCoords()+2)
                &&(y == getyCoords()+1||y == getyCoords()-1)
                ||(x == getxCoords()-1||x == getxCoords()+1)
                &&(y == getyCoords()+2||y == getyCoords()-2)){
            return true;
        }
        else{
            return false;
        }
    }
}
