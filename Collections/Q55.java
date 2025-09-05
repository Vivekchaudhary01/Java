// Remove Duplicates from Sorted List
// Linked List

class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){this.val=val;this.next=next;}
}

public class Q55 {
    public static void main(String[] args) {
        int []arr={1,1,2,3,3};
        ListNode head=buildList(arr);

        System.out.print("Original List: ");
        printList(head);

        head=deleteDuplicates(head);

        System.out.println("After Removing Duplicates: ");
        printList(head);
    }
    public static ListNode buildList(int arr[]){
        if(arr.length==0)   return null;

        ListNode head=new ListNode(arr[0]);
        ListNode current=head;

        for(int i=1;i<arr.length;i++){
            current.next=new ListNode(arr[i]);
            current=current.next;
        }
        return head;
    }

    public static void printList(ListNode head){
        ListNode current=head;
        while (current!=null) {
            System.out.print(current.val);
            if(current.next!=null)
                System.out.print("->");
            current=current.next;
        }
        System.out.println();
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode current=head;

        while (current!=null&&current.next!=null) {
            if(current.val==current.next.val)
                current.next=current.next.next;
            else
                current=current.next;
        }

        return head;
    }
}
