/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
class delete_duplicate2
{
func deleteDuplicates(head *ListNode) *ListNode {
    if head == nil      { return nil }
    if head.Next == nil { return head }

    p := head.Next
    for p != nil && p.Val == head.Val {
        p = p.Next
    }
    if p == head.Next {               // no dupliates at head
        head.Next = deleteDuplicates(p)
        return head
    } else {                          // duplicates! dump head
        return deleteDuplicates(p)
    }
}