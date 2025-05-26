package CodeWars;

/*The computer generates a secret number consisting of 4 distinct digits. 
Then the player, in 8 turns, tries to guess the number. As a result he receives 
from the computer the number of matches. If the matching digits are in their 
right positions, they are "bulls", if in different positions, they are "cows".

To implement this you will use:
1)a constructor (int) - initiates the game, receives a number and then sets it as the secret number.
2)and a function "compare with (int)" - compares the given and the secret numbers
and then returns a String formated as "X bull/bulls and Y cow/cows".

However, there are some notes:
1)if the given number matches the secret number instead of returning "4 bulls and 0 cows",
return "You win!". Any next attempts to play the game (even with invalid numbers)
should return "You already won!"
2)if the amount of turns in this game is more than 8 (invalid turns are not counted)
the returned String should be "Sorry, you're out of turns!".
3)After checking the turns you should validate the given number.
If it does not correspond to the conditions you should throw an exception :
IllegalArgumentException 
 */
public class BullsAndCows {

    String secretNumber;
    int counterTurns = 0;
    boolean win = false;

    public BullsAndCows(int n) {
        String secret = Integer.toString(n);

        if (secret.length() != 4 || n < 0 || hasRepeatedDigits(secret)) {
            throw new IllegalArgumentException("The number sent to the constructor is invalid.");
        }

        this.secretNumber = secret;
    }

    public String compareWith(int n) {
        if (win) {
            return "You already won!";
        }

        String numberIn = Integer.toString(n);

        if (counterTurns >= 8) {
            return "Sorry, you're out of turns!";
        }
        if (secretNumber.length() != numberIn.length() || n < 0 || hasRepeatedDigits(numberIn) || numberIn.length() != 4) {
            throw new IllegalArgumentException("Nop");
        }
        counterTurns++;
        int counterBulls = 0;
        int counterCows = 0;

        for (int i = 0; i < secretNumber.length(); i++) {
            if (secretNumber.charAt(i) == numberIn.charAt(i)) {
                counterBulls++;
            } else {
                for (int j = 0; j < secretNumber.length(); j++) {
                    if (i != j && secretNumber.charAt(i) == numberIn.charAt(j)) {
                        counterCows++;
                        break;
                    }
                }
            }
        }

        if (counterBulls == secretNumber.length()) {
            win = true;
            return "You win!";
        } else {
            if (counterBulls == 1 && counterCows == 1) {
                return counterBulls + " bull and " + counterCows + " cow";
            } else if (counterBulls == 1) {
                return counterBulls + " bull and " + counterCows + " cows";
            } else if (counterCows == 1) {
                return counterBulls + " bulls and " + counterCows + " cow";
            } else {
                return counterBulls + " bulls and " + counterCows + " cows";
            }
        }
    }

    private boolean hasRepeatedDigits(String number) {
        for (int i = 0; i < number.length(); i++) {
            for (int j = i + 1; j < number.length(); j++) {
                if (number.charAt(i) == number.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
