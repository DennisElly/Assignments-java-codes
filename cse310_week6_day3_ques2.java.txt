import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];
        
        // read the heights of the trees
        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
        }
        
        // sort the array using bubble sort
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < 9; i++) {
                if (heights[i] > heights[i+1]) {
                    int temp = heights[i];
                    heights[i] = heights[i+1];
                    heights[i+1] = temp;
                    sorted = false;
                }
            }
        }
        
        // print the sorted array
        for (int i = 0; i < 10; i++) {
            System.out.print(heights[i] + " ");
        }
    }
}