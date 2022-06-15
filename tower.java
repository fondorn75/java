public class tower {
    public static void main(String[] args) {
        HanoiTow ht = new HanoiTow();
        ht.Towers("1", "3", "2", 3);
        
    }
}


class HanoiTow{

    void Towers(String with, String on, String some, int count){
        if (count > 1) Towers(with, on, some, count - 1);
        String result = with+" >> "+on;
        System.out.println(result);
        if (count > 1) Towers(some, on, with, count - 1);
    }


}