public abstract class ChessPiece {

    ChessBoard chessBoard;
    private int xCoords;
    private int yCoords;

    public int getxCoords() {
        return xCoords;
    }

    public int getyCoords() {
        return yCoords;
    }

    public boolean setCoords(int x,int y){
        xCoords = x;
        yCoords = y;
        return true;
    }
    public void reset(){
        chessBoard.setChessPiece(this,0,0);
    }

    public abstract boolean moveTo(int x,int y);
    public abstract boolean validMove(int x,int y);

    public ChessPiece(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }
}
