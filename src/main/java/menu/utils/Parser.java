package menu.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Parser {

    public static List<String> splitComma(String input) {
        String[] split = input.split(Pattern.quote(","));
        List<String> result = new ArrayList<>();

        for (String s : split) {
            result.add(s.trim());
        }
        return result;
    }

}
