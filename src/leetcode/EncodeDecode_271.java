package leetcode;

import java.util.Arrays;
import java.util.List;

public class EncodeDecode_271 {

    public static String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return Character.toString((char) 258);
        }

        String separator = Character.toString((char) 257);

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : strs) {
            stringBuilder.append(s);
            stringBuilder.append(separator);
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static List<String> decode(String s) {
        String separator = Character.toString((char) 257);
        /*
        * -1 tells Java: Split as much as possible and keep all trailing empty strings. So this:

        String s = "a,b,,";
        String separator = ",";
        Arrays.asList(s.split(separator, -1));
        results in: ["a", "b", "", ""]*/

        return Arrays.asList(s.split(separator, -1));
    }

    public static void main(String[] args) {
        String encoded = encode(Arrays.asList("Hello", "World"));
        List<String> decoded = decode(encoded);

        System.out.println(encoded);
        System.out.println(decoded);
    }
}
