// Name: Rishabh Gupta | Roll Number: 2510303428 | Assignment: 2, Question: 3

class Main {
    public static void main(String[] args) {
        int year = 2024;

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}