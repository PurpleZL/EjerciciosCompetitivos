package CodeWars;

/*
You are developing an image hosting website.
You have to create a function for generating random and unique image filenames.
Create a function for generating a random 6 character string which will be used to access the photo URL.
To make sure the name is not already in use, you are given access to an PhotoManager object.
You can call it like so to
make sure the name is unique
// at this point, the website has only one photo, hosted on the 'ABCDEF' url
photoManager.nameExists("ABCDEF"); // returns true
photoManager.nameExists("BBCDEF"); // returns false
Note: We consider two names with same letters but different cases to be unique.
 */
public class ImageHostFilenameGenerator {

    public static void main(String[] args) {
        PhotoManager photoManager = new PhotoManager();
        for (int i = 0; i < 10; i++) {
            String name = ImageHostFilenameGenerator.generateName(photoManager);
            System.out.println(name);
        }
    }

    public static String generateName(PhotoManager photoManager) {
        String r;
        do {
            int cifra1 = (int) (Math.random() * 16);
            String cifra1Str = Integer.toHexString(cifra1);
            System.out.println(cifra1);
            System.out.println(cifra1Str);
            int cifra2 = (int) (Math.random() * 16);
            String cifra2Str = Integer.toHexString(cifra2);
            int cifra3 = (int) (Math.random() * 16);
            String cifra3Str = Integer.toHexString(cifra3);
            int cifra4 = (int) (Math.random() * 16);
            String cifra4Str = Integer.toHexString(cifra4);
            int cifra5 = (int) (Math.random() * 16);
            String cifra5Str = Integer.toHexString(cifra5);
            int cifra6 = (int) (Math.random() * 16);
            String cifra6Str = Integer.toHexString(cifra6);

            r = cifra1Str + cifra2Str + cifra3Str + cifra4Str + cifra5Str + cifra6Str;
        } while (!photoManager.nameExists(r));

        return r;
    }

    private static class PhotoManager {

        public PhotoManager() {
        }

        private boolean nameExists(String valueOf) {
            return false;
        }
    }

 
}
