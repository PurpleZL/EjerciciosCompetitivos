package CodeWars;

import java.util.List;

public class FriendOrFoe {
    public static List<String> friend(List<String> x){
        return x.stream().filter(name -> name.length()==4).toList();
    }
}
