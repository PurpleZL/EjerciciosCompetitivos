package CodeWars;

public class PrinterErrors {
    public static String printerError(String s) {
        return s.chars().filter(c -> c > 'm').count()+"/"+s.length();
    }
}
