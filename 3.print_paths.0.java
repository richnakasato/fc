// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public class Position {
    int row = 0;
    int col = 0;

    public Position(int r, int c) {
        row = r;
        col = c;
    }

    public Position goDown() {
        row++;
        return this;
    }

    public Position goUp() {
        row--;
        return this;
    }

    public Position goRight() {
        col++;
        return this;
    }

    public Position goLeft() {
        col--;
        return this;
    }

    public boolean isValid(char[][] board) {
        return 0 <= row && row < board.length
            && 0 <= col && col < board[0].length;
    }
}

public void pathsHelper(char[][] board, Position pos, StringBuilder path, ArrayList<String> paths) {
    path.append(board[pos.row][pos.col]);
    if (pos.row == board.length - 1 && pos.col == board[0].length - 1) {
        paths.add(path.toString());
        return;
    }
    if (pos.goDown().isValid(board)) {
        pathsHelper(board, pos, path, paths);
        path.setLength(path.length() - 1);
    }
    pos.goUp();
    if (pos.goRight().isValid(board)) {
        pathsHelper(board, pos, path, paths);
        path.setLength(path.length() - 1);
    }
    pos.goLeft();
    return;
}

public ArrayList<String> printPaths(char[][] board) {
    if (board.length == 0 || board[0].length == 0) return new ArrayList<String>();
    StringBuilder path = new StringBuilder();
    Position pos = new Position(0, 0);
    ArrayList<String> paths = new ArrayList<>();
    pathsHelper(board, pos, path, paths);
    return paths;
}
