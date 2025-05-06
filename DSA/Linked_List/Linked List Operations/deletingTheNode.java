
public class deletingTheNode {

    static class  Node {
        int data ;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }   
    }

    public static void traversAndPrint(Node head){
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; 
        }
        System.out.print("null");
    }

    public static Node deletNode(Node head , Node n){
        if(head == n){
            return head.next;
        }

        Node currentNode = head ;
        while (currentNode.next != null && currentNode.next != n) {
            currentNode = currentNode.next;
        }

        if(currentNode.next == null){
            return head;
        }

        currentNode.next = currentNode.next.next;
        
        return head;
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

        System.out.print("before operatoin : ");
        traversAndPrint(firstNode);
        
        firstNode =  deletNode(firstNode, thirdNode);        
        
        System.out.print("\nafter operation : ");
        traversAndPrint(firstNode);
 



    }

}
