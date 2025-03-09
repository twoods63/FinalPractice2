import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        try {
            File myFile = new File("file.csv");
            String dataLine;
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                dataLine = sc.nextLine();
                String[] tokens = dataLine.split(",");
                System.out.println(dataLine);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void Main(String[] args) {
        File myFile2;
        PrintWriter pw = null;
        try {
            myFile2 = new File("file.csv");
            pw = new PrintWriter(myFile2);
            pw.println("sum text");
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            if (pw != null) pw.close();
        }
    }
    public static void Main1(String[] args) {
        try {
            File myFile = new File("file.csv");
            FileOutputStream fos = new FileOutputStream(myFile, true);
            PrintWriter pw = new PrintWriter(fos);
            pw.println("sum txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    class LinkListClass {
        private Node head;
        class Node {
            public int num;
            public Node next;
        }
        LinkListClass() {
            head = null;
        }
        public void addNode(int n) {
            Node newNode = new Node();
            
        }
    }
}
