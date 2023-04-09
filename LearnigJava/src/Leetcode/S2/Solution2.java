package Leetcode.S2;
class Solution2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2){
            ListNode result = new ListNode();
            ListNode tmp = result;
            byte reminder = 0;
            while (l1 != null || l2 != null) {
                if (l1 == null){
                    tmp.val = l2.val+reminder;
                    reminder = 0;
                }
                else if(l2 == null){
                    tmp.val = l1.val + reminder;
                    reminder = 0;
                }
                else {
                    tmp.val = l1.val + l2.val+reminder;
                    reminder = 0;
                }
                if(tmp.val > 9){
                    reminder++;
                    tmp.val = tmp.val - 10;
                }
                tmp.next = new ListNode();
                tmp = tmp.next;
                if(l1 != null){
                    if(l1.next == null){
                        l1 = null;
                    }
                    else {
                        l1 = l1.next;
                    }

                }
                if(l2 != null){
                    if(l2.next == null){
                        l2 = null;
                    }
                    else {
                        l2 = l2.next;
                    }

                }

            }
            if(reminder!=0){
                tmp.next = new ListNode(reminder);
            }
            return result;

        }
}
