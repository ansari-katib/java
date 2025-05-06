
public class findingtheLowestvalue {
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int lowestValue(Node head) {
        int minvalue = head.data;
        Node currentAddNode = head.next;

        // do {
        //     if (currentAddNode.data < minvalue) {
        //         minvalue = currentAddNode.data;
        //     }
        //     currentAddNode = currentAddNode.next;
        // } while (currentAddNode != null);

        while (currentAddNode != null) {
            if(currentAddNode.data < minvalue){
                minvalue = currentAddNode.data;
            }
            currentAddNode = currentAddNode.next;
        }
        return minvalue;
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

        System.out.println("minimum node value : " + lowestValue(firstNode));

    }

}
