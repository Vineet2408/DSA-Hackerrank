

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head)
     {
         SinglyLinkedListNode h=head,p=head.next;
         if(head==null)
         return null;
         else if(head.next==null)
         return head;
         else
         {
              while(h.next!=null)
            {
                if(h.data==p.data)
                {
                 h.next=p.next;
                 p=p.next;
                }
                else
                {
                    h=h.next;
                    p=p.next;
                }
          
            }
         }
         return head;

    }

