package calculator;

import java.io.IOException;
import java.util.Scanner;

public class Menu
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|          Infix Expression Calculator          |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|  Please enter an infix expression, where      |\n" +
                           "| every operator/operand grouping is bracketed. |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|            Example: ((2+(6*3))+7)             |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|         Please enter your expression:         |");
        System.out.println("-------------------------------------------------");
        System.out.println("- Result:                                       -\n"
                +Evaluator.evaluate(Evaluator.tokenise(new Scanner(System.in).nextLine())));
        System.out.println("-------------------------------------------------");
    }
}
