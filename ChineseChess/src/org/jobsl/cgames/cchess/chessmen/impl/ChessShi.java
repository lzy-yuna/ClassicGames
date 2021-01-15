package org.jobsl.cgames.cchess.chessmen.impl;

import org.jobsl.cgames.cchess.base.Point;
import org.jobsl.cgames.cchess.chessboard.ChessBoard;
import org.jobsl.cgames.cchess.chessmen.ChessColor;
import org.jobsl.cgames.cchess.chessmen.ChessName;
import org.jobsl.cgames.cchess.chessmen.ChessRule;
import org.jobsl.cgames.cchess.chessmen.Chessman;

/**
 * @author JobsLee
 */
public class ChessShi extends Chessman implements ChessRule {
    public ChessShi(ChessColor color) {
        super(color);
    }

    @Override
    protected void setNameAndColor(ChessColor color) {
        this.color = color;
        this.name = ChessColor.RED.equals(color) ? ChessName.SHI_RED.getName() : ChessName.SHI_BLACK.getName();
    }

    @Override
    public boolean checkRule(Point nextP, ChessBoard cBoard) {
        if (ChessColor.RED.equals(color)) {
            // (3,0) (3,2) (4,1) (5,0) (5,2)
            if (nextP.getX() != 3 && nextP.getX() != 4 && nextP.getX() != 5) return false;
            if (nextP.getY() != 0 && nextP.getY() != 1 && nextP.getY() != 2) return false;
        }
        if (ChessColor.BLACK.equals(color)) {
            // (3,9) (3,7) (4,8) (5,9) (5,7)
            if (nextP.getX() != 3 && nextP.getX() != 4 && nextP.getX() != 5) return false;
            if (nextP.getY() != 7 && nextP.getY() != 8 && nextP.getY() != 9) return false;
        }
        return super.checkRule(nextP, cBoard);
    }
}