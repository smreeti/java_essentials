package datastructures;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {9, 10, 3, 13, 4, 7, 1, 2, 8};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
