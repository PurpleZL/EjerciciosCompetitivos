package CodeWars;

/*

 */
public class HumanReadableDurationFormat {

    public static void main(String[] args) {
        System.out.println(formatDuration(3662));
    }

    public static String formatDuration(int seconds) {
        String format = "";
        int temp = seconds;
        if (temp==0) {
            return "now";
        }
        if (temp / 31536000 != 0) {//hours
            format += temp / 31536000;
            format += (temp / 31536000 != 1) ? " years" : " year";
            temp %= 31536000;
        }
        if (temp / 86400 != 0) {//days
            if (temp % 86400 == 0&&!format.isBlank()) {
                format += " and ";
            }else if (!format.isBlank()) {
                format += ", ";
            }
            format += temp / 86400;
            format += (temp / 86400 != 1) ? " days" : " day";
            temp %= 86400;
        }
        if (temp / 3600 != 0) {//hours
            if (temp % 3600 == 0&&!format.isBlank()) {
                format += " and ";
            }else if (!format.isBlank()) {
                format += ", ";
            }
            format += temp / 3600;
            format += (temp / 3600 != 1) ? " hours" : " hour";
            temp %= 3600;
        }
        if (temp / 60 != 0) {//minutes
            if (temp % 60 == 0&&!format.isBlank()) {
                format += " and ";
            }else if (!format.isBlank()) {
                format += ", ";
            }
            format += temp / 60;
            format += (temp / 60 != 1) ? " minutes" : " minute";
            temp %= 60;
        }
        if (temp != 0) {//seconds
            if (!format.isBlank()) {
                format += " and ";
            }
            format += temp;
            format += (temp != 1) ? " seconds" : " second";
        }
        return format;
    }
}
