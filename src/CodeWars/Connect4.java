package CodeWars;

import java.util.Arrays;

/*
7x6
If a player successfully has 4 discs h, v or d then you should return "Player n wins!”
If a player attempts to place a disc in a column that is full then you should return ”Column full!” and the next move must be taken by the same player.
If the game has been won by a player, any following moves should return ”Game has finished!”.
Any other move should return ”Player n has a turn” where n is the current player either 1 or 2.
The columns are numbered 0-6 left to right.
 */
public class Connect4 {
    int table[][] = new int[6][7];
    boolean player = true;
    boolean win = false;
    int counter;

    public String play(int column) {
        if (win) return "Game has finished!";
        int full = 5;
        while(full >= 0 && table[full][column] != 0) full--;
        if (full < 0) return "Column full!";
        table[full][column] = (player)? 1:2;

        counter = 0;
        victory((player)? 1:2, full, column, 0, 1);
        victory((player)? 1:2, full, column, 0, -1);

        counter = 0;
        victory((player)? 1:2, full, column, 1, 0);
        victory((player)? 1:2, full, column, -1, 0);

        counter = 0;
        victory((player)? 1:2, full, column, 1, 1);
        victory((player)? 1:2, full, column, -1, -1);

        counter = 0;
        victory((player)? 1:2, full, column, -1, 1);
        victory((player)? 1:2, full, column, 1, -1);

        if (win) return (player)? "Player 1 wins!" :  "Player 2 wins!";
        player = !player;
        return (!player)? "Player 1 has a turn" :  "Player 2 has a turn";
    }

    private void victory(int p, int r, int c, int deltax, int deltay) {
        while((r+deltax<6 && r+deltax >= 0 && c+deltay < 7 && c+deltay >= 0) && table[r+deltax] [c+deltay]==p){
            counter ++;
            r+=deltax;
            c+=deltay;
        }
        if (counter >= 3) win = true;
    }
}
