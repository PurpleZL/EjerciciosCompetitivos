package CodeWars;

/*
 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point

 Throw       Score
 ---------   ------------------
 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
 */
public class GreedIsGood {

    public static void main(String[] args) {
        int[] test = {2,4,4,5,4};
        System.out.println(greedy(test));
    }

    public static int greedy(int[] dice) {
        int[] array = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                array[0]++;
            } else if (dice[i] == 2) {
                array[1]++;
            } else if (dice[i] == 3) {
                array[2]++;
            } else if (dice[i] == 4) {
                array[3]++;
            } else if (dice[i] == 5) {
                array[4]++;
            } else if (dice[i] == 6) {
                array[5]++;
            }
        }
        int points = 0;
        if (array[0] > 0) {
            if (array[0] < 3) {
                points += 100 * array[0];
            } else if (array[0] % 3 > 0) {
                points += 1000 + 100 * (array[0] % 3);
            } else {
                points += 1000;
            }
        }
        if (array[1] >= 3) {
            points += 200;
        }
        if (array[2] >= 3) {
            points += 300;
        }
        if (array[3] >= 3) {
            points += 400;
        }
        if (array[4] > 0) {
            if (array[4] < 3) {
                points += 50 * array[4];
            } else if (array[4] % 3 > 0) {
                points += 500 + 50 * (array[4] % 3);
            } else {
                points += 500;
            }
        }
        if (array[5] >= 3) {
            points += 600;
        }
        return points;
    }
}
