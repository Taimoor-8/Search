package List;

import java.util.Scanner;

public class Search {
    private NodeList head;

    private static class NodeList {
        private int data;
        private NodeList next;

        public NodeList(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean SearchElement(NodeList head , int searchKey ){
        if (head == null){
            return false;
        }
        NodeList current = head;

        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Search s = new Search();

        Scanner sc = new Scanner(System.in);

        s.head = new NodeList(10);
        NodeList second = new NodeList(5);
        NodeList third = new NodeList(8);
        NodeList fourth = new NodeList(9);
        NodeList fifth = new NodeList(12);
        s.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Enter the keyword to be searched");
        int search_key = sc.nextInt();
        if (s.SearchElement(s.head ,search_key)) {
            System.out.printf("Search keyword %d is found in the Node list ", search_key);
            System.out.println();
        }
        else{
            System.out.println("Element is not found in the list");
        }
    }
}
