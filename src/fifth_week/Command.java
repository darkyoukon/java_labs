package fifth_week;

public interface Command {
    public default void execute() {
        System.out.println("Error");
    }
}
