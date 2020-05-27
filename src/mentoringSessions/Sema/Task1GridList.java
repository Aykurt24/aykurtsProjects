package mentoringSessions.Sema;

public class Task1GridList {
    /*
        print out  below grid
        1   2   3   4
        5   6   7   8
        9   10  11  12
     */
    public static void main(String[] args) {

        int[][] grid = {
                {1, 2, 3, 4}, // 0
                {5, 6, 7, 8}, // 1
                {9, 10, 11, 12}, // 2
        };
        for (int i = 0; i < grid.length; i++) { //rows
            for (int j = 0; j < grid[i].length; j++) { //columns
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(grid.length);
    }
}

