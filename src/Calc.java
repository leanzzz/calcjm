public class Calc {
    public static String calc(Constructor expression) throws Exceptions {

        int res = switch (expression.oper) {
            case "+" -> expression.firstNumber + expression.secondNumber;
            case "-" -> expression.firstNumber - expression.secondNumber;
            case "*" -> expression.firstNumber * expression.secondNumber;
            case "/" -> (expression.firstNumber / expression.secondNumber);
            default -> 0;
        };


        if (expression.type == TypeOfNumbers.ARABIC) {
            return Integer.toString(res);
        } else if (res <= 0) {
            throw new Exceptions("Результат меньше 0. Римские числа не могут быть отрицательными.");
        } else {
            return RomToArab.romanToArabic(res);
        }

    }
}


