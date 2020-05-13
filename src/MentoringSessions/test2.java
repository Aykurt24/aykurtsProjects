package MentoringSessions;

public class test2 {
    public static String getSum(String ArrayList) {

        String a = ArrayList;
        String b = ArrayList.replace("$", "").replace(",", "");
        String[] numbers = b.split(" ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int c = Integer.parseInt(numbers[i]);
            sum += c;
            if (sum < 0) {
                sum = -1;
            }
        }
        System.out.println(sum);

        return ArrayList;

    }

    public static void main(String[] args) {

        getSum("$13, $15, $20");

    }

}