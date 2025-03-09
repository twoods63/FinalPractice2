public class SampleTest {
    class Node {
        public double Data;
        public Node Next;
    }
    double Sum (Node current) {
        if (current == null) {
            return 0;
        } else {
            return current.Data + Sum(current.Next);
        }
    }

    double Sum2 (Node current) {
        int s = 0;
        while (current != null) {
            s += current.Data;
            current = current.Next;
        }
        return s;
    }
    void addTen (Node n) {
        if (n != null) {
            n.Data += 10;
            addTen(n.Next);
        }
    }
}
