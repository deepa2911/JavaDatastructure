package linkedlistprograms;

//changes made
class LinkedlistPrintRev {
 
    Node head;
 
    /*Creating a new Node*/
    class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
 
    /*Function to add a new Node*/
    public void pushNode(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
 
    /*Displaying the elements in the list*/
    public void printNode()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null"
                         + "\n");
    }
    public void printRev()
    {
        
        printElementRev(head);
        System.out.print("Null" + "\n");
    }
    
    /*Displaying the elements in Reverse order*/
    public void printElementRev(Node cur)
    {
       
        if (cur == null) {
        	System.out.print("reverse order  ");
           return;     
        }
        printElementRev(cur.next);       
        System.out.print(cur.data + "->");
       // System.out.print("Null"+ "\n");
    }
 
 
    /*Finding the length of the list.*/
    public int getLen()
    {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
 
    /*Printing the middle element of the list.*/
   /* public void printMiddle()
    {
        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["
                             + temp.data + "]");
            System.out.println();
        }
    } */
    
    /*Printing the middle element of the list.*/
    public void printMiddle()
    {
    	Node cur= head,ptr2 = head;
        while (ptr2.next != null && ptr2.next.next!=null) {
           cur = cur.next;
           ptr2 = ptr2.next.next;
                
            }
            System.out.print("The middle element is ["
                             + cur.data + "]");
            System.out.println();
        
    }
 
 
    public static void main(String[] args)
    {
    	LinkedlistPrintRev list = new LinkedlistPrintRev();
        for (int i = 6; i >= 1; i--) {
            list.pushNode(i);
          //  list.printNode();
          // list.printMiddle();
         
        }
        list.printNode();
        list.printRev();
    }
}
 
//