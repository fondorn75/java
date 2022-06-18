import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        calcNum cn = new calcNum();
        complexCalc cc = new complexCalc();
        int typeCalc = 0;
        double temp = 0;
        String temp2 = "";
        
        try(Scanner start = new Scanner(System.in)){
            System.out.print("Введите 1 для рациональныхчисел или 2 для комплексных: ");
            typeCalc = Integer.parseInt(start.nextLine());

        if (typeCalc == 1) {

            cn.numberInput();
            temp = cn.calcResult(cn.num1, cn.num2, cn.operand);
            String output = cn.num1 + " " + cn.operand + " " + cn.num2 + " = " + temp;
            System.out.println(output);
            cn.writeInFile(output);
            
        } else{

            cc.complexNumberInput();
            temp2 = cc.complexCalcResult();
            String output = cc.compl1 + " " + cc.operand + " " + cc.compl2 + " = " + temp2;
            System.out.println(output);
            cn.writeInFile(output);

        }
        }
    }
}

class calcNum {

    String operand = "";
    double result = 0;
    double num1 = 0;
    double num2 = 0;

    void numberInput(){
        try (Scanner in = new Scanner(System.in)) {
            
            System.out.print("Input operand: ");
            operand = in.nextLine();
            System.out.print("Input first number: ");
            num1 = in.nextDouble();
            System.out.print("Input second number: ");
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

class complexCalc{

    String result = "";
    String operand = "";
    String compl1 = "";
    String compl2 = "";
    int real1 = 0;
    int real2 = 0;
    int image1 = 0;
    int image2 = 0;
    int result_real = 0;
    int result_image = 0;

    void complexNumberInput(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите знак операции: ");
            operand = sc.nextLine();
            System.out.println("Введите первое комплексное число: ");
            compl1 = sc.nextLine();
            String[] compl1_array = compl1.split("\\D+");
            real1 = Integer.parseInt(compl1_array[0]);
            image1 = Integer.parseInt(compl1_array[1]);
    
            System.out.println("Введите второе комплексное число: ");
            compl2 = sc.nextLine();
            String[] compl2_array = compl2.split("\\D+");
            real2 = Integer.parseInt(compl2_array[0]);
            image2 = Integer.parseInt(compl2_array[1]);
            } 

    }

    String complexCalcResult(){
        switch (operand) {
            case "+":
                result_real = real1 + real2;
                result_image = image1 + image2;
                result = result_real + "+" + result_image + "i";
                break;
            case "-":
                result_real = real1 - real2;
                result_image = image1 - image2;
                result = result_real + "+" + result_image + "i";
                break;
            case "*":
                result_real = real1 * real2 - image1 * image2;
                result_image = real1 * image2 + real2 * image1;
                result = result_real + "+" + result_image + "i";
                break;
            case "/":
                result_real = (real1 * real2 + image1 * image2) / (real1 * real1) + (image2 * image2);
                result_image = (real2 * image1 - real1 * image2) / (real1 * real1) + (image2 * image2);
                result = result_real + "+" + result_image + "i";
                break;
        }

        return result;
    }


}