package AceptaElReto;

/*
3
70
3600
3661

00:01:10
01:00:00
01:01:01
 */
public class AceptaElReto216 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        int gotas;
        for (int i = 0; i < casos; i++) {
            String texto = "";
            gotas = sc.nextInt();
            if (gotas / 3600 > 0) {
                if (gotas / 3600<=9) {
                    texto += "0" + gotas / 3600 + ":";
                }else texto += gotas / 3600 + ":";
                gotas = gotas % 3600;
            } else {
                texto += "00" + ":";
            }
            if (gotas / 60 > 0) {
                if (gotas / 60<=9) {
                    texto += "0" + gotas / 60 + ":";
                }else texto += gotas / 60 + ":";
                gotas = gotas % 60;
            } else { 
                texto += "00" + ":";
            }
            if (gotas > 0) {
                if (gotas<=9) {
                    texto+="0"+gotas;
                }else texto += gotas;
            } else texto += "00";
                System.out.println(texto);
            }
        }
    }
