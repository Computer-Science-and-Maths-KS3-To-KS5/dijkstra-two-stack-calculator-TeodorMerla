package calculator;

import java.util.ArrayList;
import static calculator.Operators.*;

public class Evaluator
{
    public static ArrayList<String> tokenise(String exp)
    {
        ArrayList<String> tokens = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder(); //For multi-digit number support
        int numLeftBr =0;
        int numRightBr = 0;

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);

            if(Character.isWhitespace(ch))
            {
                continue;
            }

            if(ch == '(')
            {
                numLeftBr++;
                tokens.add(String.valueOf(ch));
            }
            else if(ch == ')')
            {
                numRightBr++;
                tokens.add(String.valueOf(ch));
            }
            else if(isOperator(String.valueOf(ch)))
            {
                tokens.add(String.valueOf(ch));
            }
            else if(Character.isDigit(ch)|| ch == '.')//Start of number or leading decimal (i.e. .79)
            {
                currentNumber.setLength(0);
                while(i<exp.length() && (Character.isDigit(exp.charAt(i))||exp.charAt(i)=='.'))
                {
                    currentNumber.append(exp.charAt(i));
                    i++;
                }
                i--; //Step back after overshooting
                tokens.add(currentNumber.toString());
            }
            else
            {
                throw new IllegalArgumentException("Invalid character: "+ch);
            }
        }
        if(numLeftBr!=numRightBr)
        {
            throw new IllegalArgumentException("Brackets missed (LvsR): "+numLeftBr+" "+numRightBr);
        }
        return tokens;
    }

    public static double evaluate(ArrayList<String> tokens)
    {
        Stack<String> operators = new Stack();
        Stack<String> operands = new Stack();

        for(String token: tokens)
        {
            if(token.equals("("))
            {
                continue;
            }
            else if(Operators.isOperator(token))
            {
                operators.push(token);
            }
            else if(Operators.isNumeric(token))
            {
                operands.push(token);
            }
            else if(token.equals(")"))
            {
                String operator = operators.pop();
                if(Operators.isUnary(operator))
                {
                    operands.push(negate(operands.pop()));
                }
                else
                {
                    String b = operands.pop();
                    String a = operands.pop();

                    if(operator.equals("+"))
                    {
                        operands.push(add(a,b));
                    }
                    else if(operator.equals("-"))
                    {
                        operands.push(subtract(a,b));
                    }
                    else if(operator.equals("*"))
                    {
                        operands.push(multiply(a,b));
                    }
                    else if(operator.equals("/"))
                    {
                        operands.push(divide(a,b));
                    }
                    else if(operator.equals("^"))
                    {
                        operands.push(power(a,b));
                    }
                }
            }
        }
        return Double.parseDouble(operands.pop());
    }
}
