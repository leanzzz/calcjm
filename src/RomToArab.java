import java.util.List;

public class RomToArab {
    public static String romanToArabic(int number) {
        int i = 0;
        RomanNumeral[] romanNums = RomanNumeral.values();
        StringBuilder sb = new StringBuilder();
        while ((number > 0) && (i < romanNums.length)){
            RomanNumeral current = romanNums[i];
            if (current.getValue() <= number) {
                sb.append(current.name());
                number -= current.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }

}
