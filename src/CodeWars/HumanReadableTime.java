package CodeWars;

/*
Write a function, which takes a non-negative integer (seconds) as 
input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)
 */
public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(0));
    }

    public static String makeReadable(int seconds) {
        String res="";
        int time = seconds;
        res+=String.format("%02d:", time/3600);
        time%=3600;
        res+=String.format("%02d:", time/60);
        res+=String.format("%02d", time%60);
        return res;
    }
}
