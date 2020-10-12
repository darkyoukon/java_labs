package second_week;

public class task5 {

    public static void main(String[] args) {
        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;

        // PUT YOUR CODE HERE
        int key = -1, mid, low = 0, high = data.length-1;
        while(low < high) {
            mid = (low + high) / 2;
            if(data[mid] < numberToFind) {
                low = mid + 1;
            } else if(data[mid] > numberToFind) {
                high = mid - 1;
            } else {
                key = mid;
                break;
            }
        }
        System.out.println(key);
        // PUT YOUR CODE HERE
    }
}