package sixth_week;

public class Rle {
    public static void main(String[] args) {
        if(args.length == 1 && args[0] != null) {
            int counter = 1;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < args[0].length(); ++i) {
                if(i == args[0].length() - 1 || args[0].charAt(i+1) != args[0].charAt(i) || counter == 9) {
                    result.append(args[0].charAt(i));
                    if (counter != 1) {
                        result.append(counter);
                    }
                    counter = 1;
                } else {
                    ++counter;
                }
            }
            System.out.println(result);
        }
    }
}
