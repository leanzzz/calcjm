import java.util.Arrays;
import java.util.List;

public class ExParser {
    private static List<String> operations = Arrays.asList("+", "-", "/", "*");
    private static List<String> arabNums = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    private static List<String> romNums = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public static Constructor parser(String input) throws Exceptions {
        Constructor expression;
        String[] splitInput = input.split(" ");

        if (splitInput.length != 3) {
            throw new Exceptions("Ошибка");
        } else if (!operations.contains(splitInput[1])) {
            throw new Exceptions("Введите корректный оператор");
        } else if ((!arabNums.contains(splitInput[0]) && !romNums.contains(splitInput[0])) || (!arabNums.contains(splitInput[2]) && !romNums.contains(splitInput[2]))) {
            throw new Exceptions("Недопустимое значение");
        } else if ((arabNums.contains(splitInput[0]) && romNums.contains(splitInput[2])) || (arabNums.contains(splitInput[2]) && romNums.contains(splitInput[0]))) {
            throw new Exceptions("Введите либо арабские, либо римские числа");
        } else if (arabNums.contains(splitInput[0])) {
            expression = new Constructor(arabNums.indexOf(splitInput[0]) + 1, arabNums.indexOf(splitInput[2]) + 1, splitInput[1], TypeOfNumbers.ARABIC);
        } else {
            expression = new Constructor(romNums.indexOf(splitInput[0]) + 1, romNums.indexOf(splitInput[2]) + 1, splitInput[1], TypeOfNumbers.ROMAN);
        }
        return expression;
    }

}

