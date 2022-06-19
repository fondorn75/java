package Triangle;
import java.io.FileWriter;

/**
 * triangle
 */
public class triangle {

    public static void main(String[] args) {
        number nt = new number();
        nt.temp = 0;
        nt.n = 12;
        nt.result = "";
        System.out.println(nt.numberTriangle());
        String output = "n = " + nt.n + "\n" + nt.result;

        nt.outputInFile(output);
   
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
    
    public void outputInFile(String output) {
        try (
            FileWriter out = new FileWriter("triangle.txt", false)) {
        out.write(output);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
    }
    
}
