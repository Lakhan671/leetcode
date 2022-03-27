package linkedlist;

public class LinkedListReverse {

    ListNode head;  // head of list

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Returns count of nodes in linked list */
    public int getCount() {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static void display(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    static ListNode curr = new ListNode(0);
    static ListNode curr1 = curr;

    public static void rev(ListNode head1) {
        if (head1 == null) {
            return;
        }
        rev(head1.next);
        System.out.print(head1.val + " ");
        curr.next = head1;
        head1.next = null;
        curr = curr.next;
        return;

    }



    /* Driver program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedListReverse llist = new LinkedListReverse();
        llist.push(1);
        llist.push(20);
        llist.push(30);
        llist.push(40);
        llist.push(50);

        System.out.println("Count of nodes is " +
                llist.getCount());
        display(llist.head);
      /*  rev(llist.head);
        System.out.println();
        curr1=curr1.next;*/

        display(curr1);
    }
}
