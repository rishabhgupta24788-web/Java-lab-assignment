// Name: Rishabh Gupta | Roll Number: 2510303428 | Assignment: 5, Question: 3

class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};
        int count = 0;

        for (int value : arr) {
            if (value > 10) {
                count++;
            }
        }

        System.out.println("Count greater than 10: " + count);
    }
}