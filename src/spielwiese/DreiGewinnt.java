package spielwiese;

public class DreiGewinnt {
    public static void createGrid(int width, int height) {
        System.out.print(" | ");
        for (int i = 0; i < width; i++) {
            System.out.print((i + 1) + " | ");
            for (int a = 0; a < height; a++) {
                System.out.println();
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        createGrid(5, 10);
    }
}