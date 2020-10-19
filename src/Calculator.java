public class Calculator {
    int calc(String a, String operator, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int result;
        if (operator.equals("/")) {
            result = first / second;
            return result;
        }
        if (operator.equals("*")) {
            result = first * second;
            return result;
        }
        if (operator.equals("+")) {
            result = first + second;
            return result;
        }
        if (operator.equals("-")) {
            result = first - second;
            return result;
        }
        return Integer.parseInt("Sorry we don't support it yet");
    }
}
