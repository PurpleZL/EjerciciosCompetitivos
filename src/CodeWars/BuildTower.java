package CodeWars;

public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        String[] build = new String[nFloors];
        int large = 1+2*(nFloors-1);
        for (int i = 0; i < nFloors; i++) {
            int numStars = 1 + i * 2;
            int numSpaces = (large - numStars)/2;
            build[i]=" ".repeat(numSpaces)+"*".repeat(numStars)+" ".repeat(numSpaces);
        }
        return build;
    }
}
