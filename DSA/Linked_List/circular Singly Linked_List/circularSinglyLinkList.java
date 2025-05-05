
public class circularSinglyLinkList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);
        Node fifthNode = new Node(50);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = firstNode ;

        Node currentNode  = firstNode;
        do{
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next ;
        } while (currentNode != firstNode); 
        System.out.print("....");
    }

}
