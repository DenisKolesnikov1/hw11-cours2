package pro.sky;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        String lettersAndSpaceStr = "Petrov Ivan";
        String emptyStr = " ";

        System.out.println(StringUtils.capitalize(lettersAndSpaceStr));
        System.out.println(StringUtils.deleteWhitespace(lettersAndSpaceStr));
        System.out.println(StringUtils.substringAfterLast(lettersAndSpaceStr, " "));

    }
}