public class ChessBoard {

    int boardX;
    int boardY;

    public ChessPiece[][] chessPieces;

    public boolean setChessPiece(ChessPiece chessPiece){
        try {
            chessPieces[chessPiece.getxCoords()][chessPiece.getyCoords()] = chessPiece;
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean setChessPiece(ChessPiece chessPiece,int x,int y){
        int oldX, oldY;
        oldX = chessPiece.getxCoords();
        oldY = chessPiece.getyCoords();
        try {
            chessPieces[x][y] = chessPiece;
            chessPiece.setCoords(x,y);
            chessPieces[oldX][oldY] = null;
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int y = 0; y < boardX;y++){
            for (int x = 0; x < boardY;x++){
                if(chessPieces[x][y] != null){
                    stringBuilder.append(String.format("%1s","[♞]"));
                }
                else{
                    stringBuilder.append(String.format("%1s","[ ]"));
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    ChessBoard(){
        boardX = 8;
        boardY = 8;
        chessPieces = new ChessPiece[boardX][boardY];
    }
    ChessBoard(int x,int y){
        boardX = x;
        boardY = y;
        chessPieces = new ChessPiece[boardX][boardY];
    }
}
