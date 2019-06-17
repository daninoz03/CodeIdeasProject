package UdemyJavaCourse.Section9.AbstractClassChallenge;

public class Main {


    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        //String stringData = "Darwin Brisbane Perth Melbourne";
        String stringData = "5 7 6 9 4 6 5 2 3 1 5";
        String[] data = stringData.split(" ");

        for (String dataItem : data) {
            list.addItem(new Node(dataItem));
        }

        list.traverse(list.getRoot());

        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());
    }
}
