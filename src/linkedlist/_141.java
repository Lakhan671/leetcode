package linkedlist;
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class _141 {
    public  boolean hasCycle(ListNode head) {
      ListNode listNode=head;
     while(head!=null && head.next!=null){
        boolean t= nodefind(listNode,head.next);
        if(t){
            return  true;

        }
         head=head.next;
     }
        return false;
    }
    private  boolean nodefind(ListNode head,ListNode next){
        int c=0;
        while(head!=null){
            if(next.val==head.val){
               c++;
            }else{
                head=head.next;
            }
        }
        return  c>1?true:false;
    }

    public static void main(String[] args) {
      new _141().  hasCycle(null);
    }

}
