/**
 * triangle
 */
public class triangle {

    public static void main(String[] args) {
        int temp = 0;
        int n = 10;
        String result = "";

        for (int i = 1; i < n; i++) {
            temp = (i * (i + 1)) / 2;
            result += temp + " ";

            System.out.println(result);
        }

    }
}