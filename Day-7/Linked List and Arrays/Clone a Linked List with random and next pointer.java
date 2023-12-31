class Solution {
    public Node copyRandomList(Node head) {
        
        Map<Node,Node>mp = new HashMap<>();
        Node curr = head;

        while(curr!=null){
            Node temp = new Node(curr.val);
            mp.put(curr,temp);
            curr = curr.next;
        }

        curr = head;
        while(curr!=null){
            Node temp = mp.get(curr);
            temp.next = mp.get(curr.next);
            temp.random = mp.get(curr.random);
            curr = curr.next;
        }

        return mp.get(head);
    }
}
