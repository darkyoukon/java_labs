package second_week;

public class task4 {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int slider;
        //PUT YOUR CODE HERE
        for (int step = length / 2; step > 0; step /= 2) {
            for (int i = step; i < length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    slider = array[j];
                    array[j] = array[j + step];
                    array[j + step] = slider;
                }
            }
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}