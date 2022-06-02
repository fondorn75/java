import java.io.FileWriter;

/**
 * triangle
 */
public class triangle {

    public static void main(String[] args) {
        number nt = new number();
        nt.temp = 0;
        nt.n = 10;
        nt.result = "";
        System.out.println(nt.numberTriangle());
        String output = "n = " + nt.n + "\n" + nt.result;
        try (
                FileWriter out = new FileWriter("triangle.txt", false)) {
            out.write(output);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}

class number {
    int n;
    int temp;
    String result;

    String numberTriangle() {
        for (int i = 1; i < n; i++) {
            temp = (i * (i + 1)) / 2;
            result += temp + " ";
        }

        return result;
    }
}
