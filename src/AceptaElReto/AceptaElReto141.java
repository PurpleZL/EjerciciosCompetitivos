package AceptaElReto;

import java.util.ArrayList;

/*
({[]})()
Tengase en cuenta (obviamente) que puede haber otros simbolos.
:)

YES
YES
NO
 */
public class AceptaElReto141 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Character> list;
        String input;
        Character target;
        int solapar;
        do {
            if (sc.hasNext()) {
                input = sc.nextLine();
                list = new ArrayList<>();
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i)=='('||input.charAt(i)==')'||input.charAt(i)=='['||input.charAt(i)==']'||input.charAt(i)=='{'||input.charAt(i)=='}') {
                        list.add(input.charAt(i));
                    }
                }
                solapar=-1;
                for (int i = 0; i < list.size(); i++) {
                    target = list.get(i);
                    if (target == '(') {
                        if (list.indexOf(')') == -1 || solapar > list.indexOf(')')) {
                            break;
                        } else {
                            list.remove(i);
                            list.remove(list.lastIndexOf(')'));
                            i--;
                        }
                    } else if (target == '[') {
                        if (list.indexOf(']') == -1) {
                            break;
                        } else {
                            list.remove(i);
                            list.remove(list.lastIndexOf(']'));
                            i--;
                        }
                    } else if (target == '{') {
                        if (list.indexOf('}') == -1) {
                            break;
                        } else {
                            list.remove(i);
                            list.remove(list.lastIndexOf('}'));
                            i--;
                        }
                    }
                    System.out.println("pausa");
                }
                if (list.isEmpty()) {
                    System.out.println("YES");
                }else System.out.println("NO");
            }
        } while (sc.hasNext());
    }
}
/*
{[}] -> NO
[{[{}]}] -> YES
 */
