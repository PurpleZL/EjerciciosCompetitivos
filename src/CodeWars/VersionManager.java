package CodeWars;

/*
It should accept an optional parameter that represents the initial version. 
The input will be in one of the following formats: "{MAJOR}", "{MAJOR}.{MINOR}",
or "{MAJOR}.{MINOR}.{PATCH}". More values may be provided after PATCH but they 
should be ignored. If these 3 parts are not decimal values, an exception with 
the message "Error occured while parsing version!" should be thrown. 
If the initial version is not provided or is an empty string, use "0.0.1" by default.

This class should support the following methods, all of which should be chainable (except release):

-major() - increase MAJOR by 1, set MINOR and PATCH to 0
-minor() - increase MINOR by 1, set PATCH to 0
-patch() - increase PATCH by 1
-rollback() - return the MAJOR, MINOR, and PATCH to their values before 
the previous major/minor/patch call, or throw an exception with the message 
"Cannot rollback!" if there's no version to roll back to. 
Multiple calls to rollback() should be possible and restore the version history
-release() - return a string in the format "{MAJOR}.{MINOR}.{PATCH}"
 */
import java.util.List;
import java.util.ArrayList;

public class VersionManager {

    List<int[]> history = new ArrayList<>();
    int[] array;

    public VersionManager() {
        this("0.0.1");
    }

    public VersionManager(String version) {
        if (version == null || version.isBlank()) {
            version = "0.0.1";
        }
        String[] arrayStr = version.split("\\.");
        int[] arrayInt = new int[3];
        for (int i = 0; i < arrayStr.length && i < 3; i++) {
            if (!arrayStr[i].matches("\\d+")) {
                throw new IllegalArgumentException("Error occured while parsing version!");
            }
            arrayInt[i] = Integer.parseInt(arrayStr[i]);
        }
        this.array = arrayInt;
        this.history.add(arrayInt.clone());
    }

    public VersionManager(String version, String optional) {
        this(version);
    }

    public VersionManager major() {
        int[] newVersion = array.clone();
        newVersion[0]++;
        newVersion[1] = 0;
        newVersion[2] = 0;
        history.add(newVersion);
        array = newVersion;
        return this;
    }

    public VersionManager minor() {
        int[] newVersion = array.clone();
        newVersion[1]++;
        newVersion[2] = 0;
        history.add(newVersion);
        array = newVersion;
        return this;
    }

    public VersionManager patch() {
        int[] newVersion = array.clone();
        newVersion[2]++;
        history.add(newVersion);
        array = newVersion;
        return this;
    }

    public VersionManager rollback() {
        if (history.size() <= 1) {
            throw new IllegalArgumentException("Cannot rollback!");
        }
        history.remove(history.size() - 1);
        array = history.get(history.size() - 1).clone();
        return this;
    }

    public String release() {
        return array[0] + "." + array[1] + "." + array[2];
    }
}

