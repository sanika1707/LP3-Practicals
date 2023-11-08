import java.util.*;
public class nqueen
{
    final int N=4;
    public void printSolution(int board[][])
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public boolean isSafe(int board[][],int row,int col)
    {
        int i,j;

        for(i=0;i<col;i++)
        {
            if(board[row][i]==1)
                return false;
        }

        for(i=row,j=col;j>=0 && i>=0;i--,j--)
        {
            if(board[i][j]==1)
                return false;
        }

        for(i=row,j=col;j>=0 && i<N;i++,j--)
        {
            if(board[i][j]==1)
                return false;
        }

        return true;
    }

    public boolean solveNQUtil(int board[][], int col)
    {
        if(col>=N)
            return true;

        for(int i=0;i<N;i++)
        {
            if(isSafe(board,i,col))
            {
                board[i][col]=1;


                if(solveNQUtil(board,col+1)==true)
                    return true;

                board[i][col]=0;
            }
        }
        return false;
    }


    public boolean solveNQ()
    {
        int board[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                board[i][j]=0;
            }
        }


        if(solveNQUtil(board,0)==false)
        {
            System.out.println("Solution doesn't exist !");
            return false;
        }

        printSolution(board);
        return true;
    }


	public static void main(String[] args) {
		nqueen queen=new nqueen();

		queen.solveNQ();
	}
}
