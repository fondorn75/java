import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        calcNum cn = new calcNum();
        try (Scanner in = new Scanner(System.in)) {
            double temp = 0;
            System.out.print("Input operand: ");
            cn.operand = in.nextLine();
            System.out.print("Input first number: ");
            cn.num1 = in.nextDouble();
            System.out.print("Input second number: ");
            cn.num2 = in.nextDouble();

            temp = cn.calcResult(cn.num1, cn.num2, cn.operand);

            String output = cn.num1 + " " + cn.operand + " " + cn.num2 + " = " + temp;

            System.out.println(output);
            cn.writeInFile(output);
        }
    }
}

class calcNum {

    String operand = "";
    double result = 0;
    double num1 = 0;
    double num2 = 0;

    double calcResult(double num1, double num2, String operand) {
        switch (operand) {
            case ("/"):
                result = num1 / num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;
        }

        return result;
    }

    void writeInFile(String output) {

        File file = new File("calc_log.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter out = new PrintWriter(file);

            try {

                out.append(output);

            } finally {

                out.close();

            }
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}