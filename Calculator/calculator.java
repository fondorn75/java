package Calculator;

import java.util.Scanner;

public class calculator {

    public static void startCalc() {

        Calculator.calcNum cn = new calcNum();
        Calculator.complexCalc cc = new complexCalc();
        int typeCalc = 0;
        double temp = 0;
        String temp2 = "";
        String output = "";

        try (Scanner start = new Scanner(System.in)) {
            System.out.print("Введите 1 для рациональных чисел или 2 для комплексных: ");
            typeCalc = Integer.parseInt(start.nextLine());

            if (typeCalc == 1) {

                cn.numberInput();
                temp = cn.calcResult(cn.num1, cn.num2, cn.operand);
                output = String.format("%s %s % = %s", cn.num1, cn.operand, cn.num2, temp);
                System.out.println(output);
                cn.writeInFile(output);

            } else if (typeCalc == 2) {

                cc.complexNumberInput();
                temp2 = cc.complexCalcResult();
                output = String.format("%s %s %s = %s", cc.compl1, cc.operand, cc.compl2, temp2);
                System.out.println(output);
                cn.writeInFile(output);

            } else {
                output = "Такой операции не предусмотрено. Попробуйте еще разок.";
                System.out.println(output);
                cn.writeInFile(output);
                startCalc();
            }
        }
    }

    public static void main(String[] args) {
        startCalc();
    }
}