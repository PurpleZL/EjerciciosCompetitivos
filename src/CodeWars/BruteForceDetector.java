package CodeWars;

import java.util.*;

public class BruteForceDetector {

    public static List<String> detectBruteForce(String[] logs) {
        TreeSet<String> ipSus = new TreeSet<>();
        HashMap<String, Integer> reps = new HashMap<>();
        for (String ip : logs) {
            String ipTarget = ip.split(" ")[0];
            boolean loginStatus = ip.split(" ")[1].contains("SUCCESS");
            if (!loginStatus){
                if(reps.putIfAbsent(ipTarget, 1) == null) continue;
                reps.put(ipTarget, reps.get(ipTarget)+1);
                if (reps.get(ipTarget)>2) ipSus.add(ipTarget);
            }else{
                reps.put(ipTarget, 0);
            }
        }
        return new ArrayList<>(ipSus);
    }

    public static void main(String[] args) {
        String[] logs = {
                "192.168.1.1 LOGIN_FAIL user=admin",
                "192.168.1.1 LOGIN_FAIL user=admin",
                "192.168.1.1 LOGIN_FAIL user=root",
                "10.0.0.5 LOGIN_FAIL user=test",
                "10.0.0.5 LOGIN_SUCCESS user=test"};

        ArrayList<String> ips = new  ArrayList(detectBruteForce(logs));

        for (String ip : ips) {
            System.out.println(ip);
        }
    }
}
