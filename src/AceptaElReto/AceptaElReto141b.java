package AceptaElReto;

/*
({[]})()
Tengase en cuenta (obviamente) que puede haber otros simbolos.
:)

YES
YES
NO
 */
import java.util.ArrayList;

public class AceptaElReto141b {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        do {
            if (sc.hasNextLine()) {
                String input = sc.nextLine();
                ArrayList<Character> lista = new ArrayList<>();
                boolean condicion=true;
                for (char c : input.toCharArray()) {
                    if (c == '(' || c == '[' || c == '{') {
                        lista.add(c);
                    }else if (c == ')') {
                        if (lista.isEmpty() || lista.remove(lista.size() - 1) != '(') {
                            condicion=false;
                            break;
                        }
                    } else if (c == ']') {
                        if (lista.isEmpty() || lista.remove(lista.size() - 1) != '[') {
                            condicion=false;
                            break;
                        }
                    } else if (c == '}') {
                        if (lista.isEmpty() || lista.remove(lista.size() - 1) != '{') {
                            condicion=false;
                            break;
                        }
                    }
                }
                if (lista.size()>0||!condicion) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        } while (sc.hasNextLine());
    }
}

/*
{[}] -> NO
[{[{}]}] -> YES
 */
