import java.util.*;

public class TicTacWin {
  public static boolean hasWinner(char a, char b, char c) {
    if (a == b && b == c && a != ' ')
      return true;
    return false;
  }

  public static char whoWon(char[][] board) {
    for (int i = 0; i < 3; i++) {
      // Check rows
      if (hasWinner(board[i][0], board[i][1], board[i][2])) {
        return board[i][0];
      }

      // Check cols
      if (hasWinner(board[0][i], board[1][i], board[2][i])) {
        return board[0][i];
      }
    }
    // Diagonals
    if (hasWinner(board[0][0], board[1][1], board[2][2]))
      return board[0][0];

    if (hasWinner(board[0][2], board[1][1], board[2][0]))
      return board[0][2];

    return '?';
  }
  public static void main(String[] args) {
    System.out.println(whoWon(
          new char[][]{
            {'X', 'O', 'X'},
            {'X', 'X', 'O'},
            {'X', 'O', 'O'}
          }));
    System.out.println(whoWon(
          new char[][]{
            {'O', 'X', 'X'},
            {'O', 'O', 'X'},
            {'X', 'X', 'O'}
          }));
  }
}
