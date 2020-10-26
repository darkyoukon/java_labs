package sixth_week;

public class Rle_decoder {
    public static void main(String[] args) {
        if(args.length == 1 && args[0] != null) {
            StringBuilder result = new StringBuilder();
            for (int i = 1; i < args[0].length(); ++i) {
                 if(Character.isDigit(args[0].charAt(0)) ||
                        Character.isDigit(args[0].charAt(i-1)) && Character.isDigit(args[0].charAt(i)) ||
                        args[0].charAt(i-1) == args[0].charAt(i)) {
                    result.setLength(0);
                    break;
                } else if(!Character.isDigit(args[0].charAt(i-1)) && !Character.isDigit(args[0].charAt(i))) {
                    result.append(args[0].charAt(i-1));
                    if (i == args[0].length() - 1) {
                        result.append(args[0].charAt(i));
                    }
                } else if(i == args[0].length() - 1 && !Character.isDigit(args[0].charAt(i))) {
                    result.append(args[0].charAt(i));
                } else if(Character.isDigit(args[0].charAt(i))) {
                    for(int j = 0; j < Character.getNumericValue(args[0].charAt(i)); ++j) {
                        result.append(args[0].charAt(i-1));
                    }
                }
            }
            System.out.println(result);
        }
    }
}