import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            String output;
            while (!(input = buffer.readLine()).equals("exit")) {
                try {
                    Constructor expr = ExParser.parser(input);
                    output = Calc.calc(expr);
                    System.out.println("Результат: " + output);
                } catch (Exceptions str) {
                    System.out.println(str.toString());
                    System.exit(0);
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
            System.exit(0);
        }
    }
}
