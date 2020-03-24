package com.cn.test;

import sun.applet.Main;

/**
 * Created by fiona on 2020/3/19.
 */
public class NodeTest {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode res = removeNthFromEnd(n1,2);
        while (res != null){
            System.out.println(res.value);
            res = res.next;
        }

    }



    public  static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null){
            length ++;
            first = first.next;
        }
        length -=n;
        first = dummy;
        while (length > 0){
            length --;
            first = first.next;
        }

        first.next = first.next.next;
        return dummy.next;
    }

}
