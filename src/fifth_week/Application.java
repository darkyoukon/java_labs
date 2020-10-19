package fifth_week;

public class Application {
    public static void main(String[] args){
        Command app_try;
        if(args == null || args.length < 1 || args.length > 3) {
            app_try = new Error();
        } else if(args.length == 1) {
            app_try = switch (args[0]) {
                case "help" -> new Help();
                case "exit" -> new Exit();
                default -> new Error();
            };
        } else {
            app_try = switch (args[0]) {
                case "echo" -> new Echo(args[1]);
                case "date" -> args[1].equals("now") ? new Date() : new Error();
                default -> new Error();
            };
        }
        app_try.execute();
    }
}
