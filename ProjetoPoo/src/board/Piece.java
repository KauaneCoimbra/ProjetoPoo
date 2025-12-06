package board;

import chess.Color;

public abstract class Piece {
    public Position position;
    public Piece() {}
    public Position getPosition() { return position; }
    protected void setPosition(Position position) { this.position = position; }

    public abstract boolean[][] possibleMoves();
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0;i<mat.length;i++) {
            for (int j=0;j<mat[i].length;j++) {
                if (mat[i][j]) return true;
            }
        }
        return false;
    }
	public abstract Color getColor();
}
