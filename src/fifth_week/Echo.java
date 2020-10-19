package fifth_week;

public class Echo implements Command {
    String echoing;

    Echo(String echoing) {
         this.echoing = echoing;
    }
    public void execute() {
        System.out.println(echoing);
    }
}
