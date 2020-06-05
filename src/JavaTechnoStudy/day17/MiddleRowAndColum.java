package JavaTechnoStudy.day17;

public class MiddleRowAndColum {

    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 4, 5, 6},
                {7, 6, 9, 5, 6},
                {2, 1, 83, 5, 6},
                {3, 5, 75, 5, 6},
                {2, 1, 83, 5, 6},


        };
        middleRow(arr);
        System.out.println("===============");
        middleCoulm(arr);
    }


    public static void middleRow(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[arr1.length - (arr1.length + 1) / 2][i]);

        }
    }

    public static void middleCoulm(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i][arr1.length - (arr1.length + 1) / 2]);

        }
    }

}

