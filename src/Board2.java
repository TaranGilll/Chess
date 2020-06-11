public class Board2
{
    private static Square[][] board;

    public Board2()
    {
        initializeBoard();
    }

    public void initializeBoard()
    {
        //Test run to set the board with all the Pawns;
        board = new Square[8][8];
        for (int i = 0; i < board.length; i++)
        {
            board [1][i] = new Square (1, i ,new Pawn(true) );
        }
        for (int i = 0; i < board.length; i++)
        {
            board [6][i] = new Square (6, i ,new Pawn(false) );
        }
    }

    public Square[][] getBoard()
    {
        return board;
    }

    public static void main (String[] args)
    {
        Board2 b1 = new Board2();
        //System.out.println(Arrays.deepToString(board));
    }
    //
}
