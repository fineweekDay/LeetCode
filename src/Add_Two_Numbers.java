
/**
 * Title:Add Two Numbers
 *
 * Description:You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.You may assume the two numbers do not contain any leading zero,
 * except the number 0 itself.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * Created by Administrator on 2017/11/14.
 */
public class Add_Two_Numbers {

    static class ListNode{
        int value;
        ListNode next;

        ListNode(int value,ListNode next){
            this.value=value;
            this.next=next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode sign=new ListNode(0,null);
        ListNode p=l1,q=l2,curr=sign;
        int carry=0;

        while(p!=null || q!=null){
            int x=(p!=null) ? p.value:0;
            int y=(q!=null) ? q.value:0;
            int sum=carry+x+y;
            carry=sum/10;
            curr.next=new ListNode(sum%10,null);
            curr=curr.next;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
        }

        if(carry>0)
            curr.next=new ListNode(carry,null);

        return sign.next;
    }

    public static void main(String[] args){
        ListNode p1=new ListNode(2,null);
        p1.next=new ListNode(4,null);
        p1.next.next=new ListNode(3,null);

        ListNode p2=new ListNode(5,null);
        p2.next=new ListNode(6,null);
        p2.next.next=new ListNode(4,null);

        ListNode result=new Add_Two_Numbers().addTwoNumbers(p1,p2);

        while(result!=null){
            System.out.print(result.value+" ");
            result=result.next;
        }
        System.out.println();
    }//result:7 0 8
}
