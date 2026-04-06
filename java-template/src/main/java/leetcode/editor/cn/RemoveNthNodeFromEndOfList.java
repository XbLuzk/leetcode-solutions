package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class RemoveNthNodeFromEndOfList {

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            dummy.next=head;
            ListNode p1 = dummy;
            ListNode p2 = dummy;
            for (int i = 0; i < n+1; i++) {
                p1=p1.next;
            }
            while(p1!=null)
            {
                p1=p1.next;
                p2=p2.next;
            }

            p2.next=p2.next.next;
            return dummy.next;

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
        // put your test code here
        
    }
}