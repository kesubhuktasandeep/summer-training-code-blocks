//class links1 {
//     class node {
//         int data;
//         node next;

//         node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     node head;

//     links1() {
//         this.head = null;
//     }

//     void addFirst(int data) {
//         node newNode = new node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     void addLast(int data) {
//         node newNode = new node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             node current = head;
//             while (current.next != null) {
//                 current = current.next;
//             }
//             current.next = newNode;
//         }
//     }

//     int size() {
//         int count = 0;
//         node current = head;
//         while (current != null) {
//             count++;
//             current = current.next;
//         }
//         return count;
//     }

//     int sum() {
//         int total = 0;
//         node current = head;
//         while (current != null) {
//             total += current.data;
//             current = current.next;
//         }
//         return total;
//     }

//     public static void main(String[] args) {
//         links1 myList = new links1();
//         myList.addFirst(10);
//         myList.addFirst(20);
//         myList.addFirst(30);
//         myList.addLast(40);
//         myList.addLast(50);
//         System.out.println("Size of the linked list: " + myList.size());
//         System.out.println("Sum of the linked list: " + myList.sum());
//     }
// class Solution 
// {
//     public int getDecimalValue(ListNode head) 
//     {
//         ListNode mover = head;
//         int num = 0;  // Decimal value to be returned
//         int size = 0; // Size of the linked list

//         while(mover != null)
//         {
//             size++;
//             mover = mover.next;
//         }

//         ListNode temp_node = head;

//         for(int i = size-1;i >= 0;i--)
//         {
//             num += (temp_node.val)*(int)Math.pow(2,i); 

//             temp_node = temp_node.next;
//         }

//         return num;
//     }
// }

// }
