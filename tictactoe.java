// Method Templates
// As written, this code will not compile -- two pairs of methods with the same signature
// This is meant to be a reference file for you.

import java.util.Scanner;

public class TicTacToe
    {
       public static void main(String[] args)
       {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe! A stress filled program!");
        String[][] board =
        {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };
        boolean done = false;
        int player = 1;
        int spot = 0;
       printBoard(board);
        while (done != true)
        {
            System.out.println("Enter a number (1-9) to claim your spot!");
            spot = input.nextInt();
            if (player == 1)
            {
            	if (spot == 1)
            	{
					board[0][0] = "X";
					player = 2;
				}
				else if (spot == 2)
				{
					board[0][1] = "X";
					player = 2;
				}
				else if (spot == 3)
				{
					board[0][2] = "X";
					player = 2;
				}
				else if (spot == 4)
				{
					board[1][0] = "X";
					player = 2;
				}
				else if (spot == 5)
				{
					board[1][1] = "X";
					player = 2;
				}
				else if (spot == 6)
				{
					board[1][2] = "X";
					player = 2;
				}
				else if (spot == 7)
				{
					board[2][0] = "X";
					player = 2;
				}
				else if (spot == 8)
				{
					board[2][1] = "X";
					player = 2;
				}
				else if (spot == 9)
				{
					board[2][2] = "X";
					player = 2;
				}
			}
			else if (player == 2)
			{
            	if (spot == 1)
            	{
					board[0][0] = "O";
					player = 1;
				}
				else if (spot == 2)
				{
					board[0][1] = "O";
					player = 1;
				}
				else if (spot == 3)
				{
					board[0][2] = "O";
					player = 1;
				}
				else if (spot == 4)
				{
					board[1][0] = "O";
					player = 1;
				}
				else if (spot == 5)
				{
					board[1][1] = "O";
					player = 1;
				}
				else if (spot == 6)
				{
					board[1][2] = "O";
					player = 1;
				}
				else if (spot == 7)
				{
					board[2][0] = "O";
					player = 1;
				}
				else if (spot == 8)
				{
					board[2][1] = "O";
					player = 1;
				}
				else if (spot == 9)
				{
					board[2][2] = "O";
					player = 1;
				}
			}
			else
			{
				done = false;
			}

            	printBoard(board);
				hasWinner(board);
        }
			//hasWinner(board);

      }

		//Displaying the board
		public static void printBoard(String[][] board)
		{
			for (int row = 0; row < 3; row++)
			{
				for (int col = 0; col < 3; col++)
			{
				System.out.print("|" + board[row][col] + "");
			}
			System.out.println();
			System.out.println("------");
		}
	}

		public static void hasWinner(String[][] board)
		{
			boolean win = false;
			while (win != true)
			{
			//horizontal x
			if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
				break;
			}
			else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
			}
			else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
			}
			//horizontal o
			else if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			//vertical x
			else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
			}
			else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
			}
			else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
			}
			//vertical o
			else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			//diagonal x
			else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
			}
			else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == "X")
			{
				System.out.println("Player one wins!");
				win = false;
			}
			//diagonal o
			else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == "O")
			{
				System.out.println("Player two wins!");
				win = false;
			}
			else
			{
				win = true;
			}
			}
		}


}
