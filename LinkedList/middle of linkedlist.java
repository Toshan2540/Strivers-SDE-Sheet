/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node findMiddle(Node head)
    {
        if(head == null ||head.next == null){
            return head;
        }
       Node fast = head;Node slow = head;
       while(fast!= null&&fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
    }
}