import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    @Test
    void setCoords() {
        ChessBoard chessBoard = new ChessBoard(8,8);
        Knight knight = new Knight(chessBoard);
        chessBoard.setChessPiece(knight);
        System.out.println(chessBoard.toString());
        boolean moved = knight.moveTo(1,-2);
        System.out.println(chessBoard.toString());
        assertTrue(moved);
        knight.reset();
        System.out.println(chessBoard.toString());
        moved = knight.moveTo(1,1);
        System.out.println(chessBoard.toString());
        assertFalse(moved);
        moved = knight.moveTo(2,-1);
        System.out.println(chessBoard.toString());
        assertTrue(moved);
        moved = knight.moveTo(0,-2);
        System.out.println(chessBoard.toString());
        assertTrue(moved);
    }
}