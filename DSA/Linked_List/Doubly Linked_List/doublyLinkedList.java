
public class doublyLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static void main(String[] args) {

        Node firstNode = new Node(4);
        Node secondNode = new Node(2);
        firstNode.next = secondNode;
        secondNode.prev = firstNode;

        Node thirdNode = new Node(6);
        secondNode.next = thirdNode;
        thirdNode.prev = secondNode;

        Node fourthNode = new Node(8);
        thirdNode.next = fourthNode;
        fourthNode.prev = thirdNode;

        Node currNode = firstNode;
        System.out.println("Forword : " + currNode.data);
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

        currNode = fourthNode;
        System.out.println("Backword : " + currNode.data);
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("null");

    }

}
