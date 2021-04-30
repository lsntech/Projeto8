public class LinkedList30days {





    public static  Node insert(Node head,int data) {

        if(head == null){
            return new Node(data);
        }

        Node tmp = head;

        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(data);

        return head;


    }




    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }

    }


    public static void main(String[] args) {

        Node head = null;
        int[] arr = {2,3,4,1};

        int N = arr.length;

        while(N-- > 0) {
            int ele = arr[N];
            head = insert(head,ele);
        }
        display(head);








    }







}


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}


