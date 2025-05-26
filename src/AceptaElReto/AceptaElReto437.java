package AceptaElReto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
Ejemplo de entrada:
2
00:00:30
01:00:59

Salida esperada:
23:59:30
22:59:01
*/
public class AceptaElReto437 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        for (int i = 0; i < casos; i++) {
            String[] time = sc.nextLine().split(":");
            int horas = Integer.parseInt(time[0]);
            int minutos = Integer.parseInt(time[1]);
            int segundos = Integer.parseInt(time[2]);
            
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            
            cal.add(Calendar.HOUR_OF_DAY, -horas);
            cal.add(Calendar.MINUTE, -minutos);
            cal.add(Calendar.SECOND, -segundos);
            
            System.out.println(sdf.format(cal.getTime()));
        }
    }
}
