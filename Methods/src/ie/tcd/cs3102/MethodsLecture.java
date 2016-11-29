package ie.tcd.cs3102;

public class MethodsLecture {
    private static final String testString = "This is a test string";
    private static final String otherString = "Hello, world";

    private static boolean hasSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                return true;
            }
        }
        return false;
    }

    private static double pi() {
        return Math.PI;
    }

    public static void main(String[] args) {

        if (hasSpace(testString)) {
            System.out.println("Has a space");
        }

        if (StringsUltility.isSubstring(testString, "test")) {
            System.out.println("Found test");
        }

        if (!StringsUltility.isSubstring(testString, "wufhiweufh")) {
            System.out.println("Didn't find rubbish");
        }

        if (StringsUltility.isSubstring(otherString, "world")){
            System.out.print("Found world");
        }

        StringsUltility.boxString(testString);
    }

}
