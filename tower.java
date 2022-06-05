public class tower {
    public static void main(String[] args) {
        Hanoi ht = new Hanoi();
        ht.Towers("1", "3", "2", 3);
    }
}


class Hanoi{

    String Towers(String with, String on, String some, int count){
        if (count > 1) Towers(with, on, some, count - 1);
        String result = with+">>"+on;
        return result;
    }


}