package Eight_Queens;

public class Queens {
    private int[] column; 
    private int[] rup; 
    private int[] lup; 
    private int[] queens; 
    private int num; 

    public Queens() {
        column = new int[8 + 1];
        rup = new int[(2 * 8) + 1];
        lup = new int[(2 * 8) + 1];
        for (int i = 1; i <= 8; i++)
            column[i] = 0;
        for (int i = 1; i <= (2 * 8); i++)
            rup[i] = lup[i] = 0; 
        queens = new int[8 + 1];
    }

    public void turnBack(int i) {
        if (i > 8) {
            showAnswer();
        } else {
            for (int j = 1; j <= 8; j++) {
                if ((column[j] == 0) && (rup[i + j] == 0) && (lup[i - j + 8] == 0)) {
                    
                    queens[i] = j; 
                    column[j] = rup[i + j] = lup[i - j + 8] = 1;
                    turnBack(i + 1); 
                    column[j] = rup[i + j] = lup[i - j + 8] = 0;
                }
            }
        }
    }

    protected void showAnswer() {
        num++;
        System.out.println("\nОтвет: " + num);
        for (int y = 1; y <= 8; y++) {
            for (int x = 1; x <= 8; x++) {
                if (queens[y] == x) {
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queens queen = new Queens();
        queen.turnBack(1);
    }
}