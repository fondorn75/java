package Calculator;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class calcNum {

    String operand = "";
    double result = 0;
    double num1 = 0;
    double num2 = 0;

    void numberInput(){
        try (Scanner in = new Scanner(System.in)) {
            
            System.out.print("Введите знак операции: ");
            operand = in.nextLine();
            System.out.print("Введите первое число: ");
            num1 = in.nextDouble();
            System.out.print("Введите второе число: ");
            num2 = in.nextDouble();
        }
    }

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

            FileWriter fw = new FileWriter(file, true);

            try {

                fw.append(output + "\n");

            } finally {

                fw.flush();
                fw.close();

            }
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
