package third_week.linked_list;

public class Main {

    public static void main(String[] args) {
        LinkedList sample = new LinkedList();
        sample.add((Integer)8);
        sample.add((Integer)9);
        sample.add((Integer)10);
        sample.delete(2);
        System.out.println(sample.get(1));
    }
}