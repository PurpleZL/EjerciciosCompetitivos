package CodeWars;

/*
A Bingo card contains 24 unique and random numbers according to this scheme:

5 numbers from the B column in the range 1 to 15
5 numbers from the I column in the range 16 to 30
4 numbers from the N column in the range 31 to 45
5 numbers from the G column in the range 46 to 60
5 numbers from the O column in the range 61 to 75
Write the function get_card()/getCard(). The card must be returned as an array 
of Bingo style numbers:
[ 'B14', 'B12', 'B5', 'B6', 'B3', 'I28', 'I27', ... ]
 */
public class BingoCards {

    public static void main(String[] args) {
        String[] test = getCard();
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }

    public static String[] getCard() {
        String[] array = new String[24];
        for (int i = 0; i < array.length; i++) {
            array[i] = "";
        }

        String temp;
        for (int i = 1; i <= 24; i++) {
            if (i <= 5) {
                do {
                    temp = "B" + (int) (Math.random() * 15 + 1);
                } while (isDuplicate(array, temp));
                array[i - 1] = temp;
            } else if (i <= 10) {
                do {
                    temp = "I" + (int) (Math.random() * 15 + 16);
                } while (isDuplicate(array, temp));
                array[i - 1] = temp;
            } else if (i <= 14) {
                do {
                    temp = "N" + (int) (Math.random() * 15 + 31);
                } while (isDuplicate(array, temp));
                array[i - 1] = temp;
            } else if (i <= 19) {
                do {
                    temp = "G" + (int) (Math.random() * 15 + 46);
                } while (isDuplicate(array, temp));
                array[i - 1] = temp;
            } else {
                do {
                    temp = "O" + (int) (Math.random() * 15 + 61);
                } while (isDuplicate(array, temp));
                array[i - 1] = temp;
            }
        }
        return array;
    }
    

    public static boolean isDuplicate(String[] array, String temp) {
        for (String s : array) {
            if (s.equals(temp)) {
                return true;
            }
        }
        return false;
    }
}
