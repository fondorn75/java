package Hanoi_Towers;
public class hanoi {

    static void Towers(String with, String on, String some, int count) {

        if (count > 1)
            Towers(with, some, on, count - 1);
        System.out.println(with + " -> " + on);
        if (count > 1)
            Towers(some, on, with, count - 1);
    }

    public static void main(String[] args) {
        Towers("1", "3", "2", 3);

    }
}
