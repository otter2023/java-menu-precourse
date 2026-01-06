package menu.utils;

import java.util.List;
import java.util.regex.Pattern;

public class Parser {

    public static List<String> splitComma(String input){
        String[] split = input.split(Pattern.quote(","));
        return List.of(split);
    }

}
