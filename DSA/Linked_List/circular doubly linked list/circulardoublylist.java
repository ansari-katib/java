
public class circulardoublylist {
    
    static class  Node {
    
        int data ; 
        Node next; 
        Node prev ;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        
    }

    public static void main(String[] args) {
        
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        firstNode.next = secondNode;
        secondNode.prev = firstNode;

        Node thirdNode = new Node(30);
        secondNode.next = thirdNode;
        thirdNode.prev = secondNode;

        Node fourthNode = new Node(40);
        thirdNode.next = fourthNode;
        fourthNode.prev = thirdNode ;

        Node fifthNode = new Node(50);
        fourthNode.next = fifthNode;
        fifthNode.prev = fourthNode;
        
        fifthNode.next = firstNode ;
        firstNode.prev = fifthNode;


        Node currNode = firstNode ;
        System.out.print("Forward Circular Linked list : ");
        do{
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }while(currNode != firstNode);
        System.out.println("...");

        currNode = firstNode ;
        System.out.print("Backword Circular Linked list : ");
        do {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        } while (currNode != firstNode);
        System.out.print("...");

    }



}
