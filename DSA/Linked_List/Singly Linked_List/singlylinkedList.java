public class singlylinkedList {

    static class Node {
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        Node firstNode = new Node(3);
        Node secondNode = new Node(6);
        Node thirdNode = new Node(8);
        Node fourthNode = new Node(9);
        Node fifthNode = new Node(53);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;

        Node currentNode = firstNode;

        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
}
