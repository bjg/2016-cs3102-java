package ie.tcd.cs3102;

/**
 * Created by brian on 25/10/2016.
 */
public class StringsUltility {

    protected static boolean isSubstring(String s, String t) {
        for (int i = 0; i < s.length() - t.length(); i++) {
            String slice = s.substring(i, i+t.length());
            if ( slice.compareTo(t) == 0 ) {
                return true;
            }
        }
        return false;
    }

    protected static void boxString(String s) {
        int len = s.length();
        System.out.print('+');
        System.out.print(countOf('-', len));
        System.out.println('+');
        System.out.print('|');
        System.out.print(s);
        System.out.println('|');
        System.out.print('+');
        System.out.print(countOf('-', len));
        System.out.println('+');
    }

    private static String countOf(char c, int count) {
        /*
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(c);
        }
        return sb.toString();
        */
        String s = "";
        for (int i = 0; i < count; i++) {
            s = s + c;
        }
        return s;
    }
}
