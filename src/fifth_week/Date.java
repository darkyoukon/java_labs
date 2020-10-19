package fifth_week;

public class Date implements Command {
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
