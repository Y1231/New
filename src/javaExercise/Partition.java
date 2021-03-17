package javaExercise;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here

        ListNode last1=new ListNode(-1);
        ListNode last2=new ListNode(-2);
        ListNode newHead=last1;
        ListNode newHead2=last2;



        ListNode cur=pHead;
        if(cur==null){
            return null;
        }

        while(cur!=null){
            if(cur.val<=x){
                last1.next=cur;
                last1=cur;
            }else{
                last2.next=cur;
                last2=cur;
            }
        }

        last1.next=newHead2.next;
        last2.next=null;
        return newHead.next;

    }
}*/
