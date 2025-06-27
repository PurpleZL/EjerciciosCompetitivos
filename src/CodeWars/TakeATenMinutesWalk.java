package CodeWars;

/*
String s = new String(walk);
        return s.chars().filter(p->p=='n').count()==s.chars().filter(p->p=='s').count()&&
                s.chars().filter(p->p=='e').count()==s.chars().filter(p->p=='w').count()&&s.chars().count()==10;
*/

public class TakeATenMinutesWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length!=10) return false;
        int ns = 0;
        int ew = 0;
        for (char c : walk) {
            if (c == 'n'){
               ns--;
            } else if (c == 's') {
                ns++;
            } else if (c == 'e') {
                ew--;
            } else if (c == 'w') {
                ew++;
            }
        }
        return ns == 0 && ew == 0;
    }

    public static void main(String[] args) {

    }
}
