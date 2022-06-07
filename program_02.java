import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Пример 5
 * входные данные находятся в файле input.txt в виде
 * b 3
 * a 10
 * Результат нужно сохранить в файле output.txt
 * 1000
*/
public class program_02 {

    static void outputInFile(double temp) {

        try (FileWriter out = new FileWriter("output.txt", false)) {
            out.write(Double.toString(temp));

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) throws Exception {

        MyPow mp = new MyPow();
        int[] temp = new int[2];
        double tempres = 0f;

        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        for (int index = 0; index < 2; index++) {
            temp[index] = Integer.parseInt(in.readLine());
        }

        mp.value = temp[0];
        mp.pow = temp[1];

        tempres = mp.resultPow();

        System.out.println(tempres);
        in.close();

        outputInFile(tempres);

    }
}

class MyPow {
    double result = 0f;
    int value = 0;
    int pow = 0;

    double resultPow() {

        result = Math.pow(value, pow);

        return result;

    }
}