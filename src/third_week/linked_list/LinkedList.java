package third_week.linked_list;

public class LinkedList {
    private Node head;

    public LinkedList() {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        Node adding = new Node();
        adding.setData(data);

        if(head == null) {
            head = adding;
        } else {
            Node travelling = head;
            while(travelling.getNext() != null) {
                travelling = travelling.getNext();
            }
            travelling.setNext(adding);
        }
        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        //PUT YOUR CODE HERE
        if(head == null) return null;
        Node travelling = head;
        for(int i = 0; i < index; ++i) {
            if(travelling.getNext() == null) return null;
            travelling = travelling.getNext();
        }
        return travelling.getData();
        //PUT YOUR CODE HERE
    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        if(index < 0 || head == null) return false;
        if(index == 0) {
            head = head.getNext();
            return true;
        }
        Node currNode = head, prev = null;
        for(int i = 0; i < index; i++) {
            if(currNode.getNext() == null) return false;
            prev = currNode;
            currNode = currNode.getNext();
        }
        prev.setNext(currNode.getNext());
        return true;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        int checkSize = 0;
        Node travelling = head;
        while(travelling != null) {
            ++checkSize;
            travelling = travelling.getNext();
        }
        return checkSize;
        //PUT YOUR CODE HERE
    }
}