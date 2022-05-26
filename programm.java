import java.util.Scanner;

/**
 * Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
 * количество выполняемых действий к минимуму.
 * Пример 1: а = 3, b = 2, ответ: 9
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 * Пример 4: а = 0, b = 0, ответ: не определено
 * Пример 5
 * входные данные находятся в файле input.txt в виде
 * b 3
 * a 10
 * Результат нужно сохранить в файле output.txt
 * 1000
 */
public class programm {

    public static void main(String[] args) {

        double result = 0f;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int value = in.nextInt();
        System.out.print("Input a pow: ");
        int pow = in.nextInt();
        if (pow == 0 || value == 0) {
            System.out.println("Not feasible!");
        } else {
            result = Math.pow(value, pow);
            System.out.println("number = " + value + ", b = " + pow + " answer = " + result);
        }

        in.close();
    }
}