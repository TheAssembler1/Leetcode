//LINK::https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {
        int totalNodes = 0;
        
        ListNode nextNode = head;
        while(nextNode != null){
            nextNode = nextNode.next;
            totalNodes++;
        }
        
        int midNode = totalNodes / 2;
        
        nextNode = head;
        for(int i = 0; i <  midNode; i++)
            nextNode = nextNode.next;
        
        return nextNode;
    }
}