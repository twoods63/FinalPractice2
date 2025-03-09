import javafx.scene.Node;
import java.util.*;
public class LinkListClass {
    private Node first;
    class Node {
        public int num;
        public Node next;
    }
    public LinkListClass() {
        first = null;
    }
    public void addNode(int n) {
        Node newNode = new Node();
        newNode.num = n;
        newNode.next = first;
        first = newNode;
    }
    public void addBack(int n) {
        Node temp = new Node();
        temp.num = n;
        temp.next = null;
        if (first == null) {
            first = temp;
        } else {
            Node current = first;
            while(current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
    }
    public void remove(int n) {
        Node curr = first;
        Node prev = curr;
        if (curr.num == (n)) {
            first = curr.next;
            return;
        }
        while (curr.num != (n)) {
            prev = curr;
            curr = curr.next;
            if (curr == null) { return; }
        }
        prev.next = curr.next;
    }
    public String display() {
        Node current = first;
        String data = "";
        while (current.next != null) {
            data += " " + current.num + "-->";
            current = current.next;
        }
        data += " " + current.num + "-->";
        return data;
    }
    public static void main(String[] args) {
        LinkListClass LL = new LinkListClass();
        LL.addNode(5);
        LL.addNode(7);
        LL.addNode(1);
        LL.addBack(4);
        System.out.println("display1 " + LL + " " + LL.display());
        LL.remove(5);
        System.out.println("display2 " + LL + " " + LL.display());
        LL.remove(9);
        System.out.println("display3 " + LL + " " + LL.display());
        LL.remove(8);
        System.out.println("display4 " + LL + " " + LL.display());
        LL.remove(3);
        System.out.println("display5 " + LL + " " + LL.display());
    }
}
