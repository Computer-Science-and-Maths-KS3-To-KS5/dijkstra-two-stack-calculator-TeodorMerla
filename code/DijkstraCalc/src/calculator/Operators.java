package calculator;

public class Operators
{
    public static String add(String a, String b) {
        double result = Double.parseDouble(a) + Double.parseDouble(b);
        return String.valueOf(result);
    }

    public static String subtract(String a, String b) {
        double result = Double.parseDouble(a) - Double.parseDouble(b);
        return String.valueOf(result);
    }

    public static String multiply(String a, String b) {
        double result = Double.parseDouble(a) * Double.parseDouble(b);
        return String.valueOf(result);
    }

    public static String divide(String a, String b) {
        if (Double.parseDouble(b) == 0) {
            throw new ArithmeticException("Math Error: Attempted division by zero");
        }
        double result = Double.parseDouble(a) / Double.parseDouble(b);
        return String.valueOf(result);
    }

    public static String power(String base, String exponent)
    {
        return String.valueOf(Math.pow(Double.parseDouble(base), Double.parseDouble(exponent)));
    }

    public static String negate(String a)
    {
        return String.valueOf(-Double.parseDouble(a));
    }

    public static boolean isOperator(String token)
    {
        return "+-*/^~".contains(token);
    }

    public static boolean isUnary(String operator)
    {
        return operator.equals("~");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
