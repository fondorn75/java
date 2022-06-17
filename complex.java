import java.util.Scanner;

public class complex {
    public static void main(String[] args) {

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

        } catch (NumberFormatException e) {

            e.printStackTrace();
        }

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

        System.out.println(result);
    }
}
