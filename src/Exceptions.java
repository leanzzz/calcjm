public class Exceptions extends Exception {
    String message;

    Exceptions(String str) {
        message = str;
    }

    public String toString() {
        return message;
    }

}

