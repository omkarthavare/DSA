package linkList;

public class first <T> {
    node head;                //head of list

    class node{
        T data;
        node next;
    

    node () {                     // default constructor
        data= null;
        next= null;
    }

     node (T d){            //parametric constructor
        data = d;
        next = null;
     }
    
    }

    first (){              //default constructor for first class header node
        head = new node();
    }

    //Insertion operation

    public void insertfront( T data){
        node newNode = new node(data);  // allocation of node 
        newNode.next = this.head.next;

        //make new node as first node

        this.head.next = newNode;

    }

    public void insertEnd(T data){
        node newNode = new node(data);
        newNode.next = null;
        node temp = this.head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertKey(T data, T key){
        node newNode = new node(data);
        newNode.next = null;
        node temp = this.head;

        boolean status = false;

        while (temp != null) {

            if (temp.data == key) {
                status = true;
                break;
                
            }
            temp = temp.next;
            
        }
        if (status) {
            newNode.next = temp.next;
            temp.next = newNode ;
            
        }


        
    }

    // for printing the list we need to make print method

    public void printList(){
        node currNode = this.head.next;
        System.out.println("PrintList");

        while (currNode != null) {
            System.out.println(currNode.data  + " ");
            currNode = currNode.next;
            
        }
        System.out.println();
    }

///DELET OPERATIONS OF LINKLIST FROM FRONT , END , KEY
/// DELETE FROM FRONT


    public T deleteFront(){
        T x = null;
        node temp =  this.head.next;

        if (temp != null) {
            x = temp.data;
            this.head.next = temp.next;           //changed the head

            System.out.println("element deleted");
            
        }
        return x ;         // return the declare data


    }

    // DELETE FROM END

    public T deleteEnd(){
        T x = null;
        node temp = this.head.next, prev = this.head;

      if (temp != null) {
        while (temp != null) {
            prev = temp;
            temp = temp.next;
            
        }
        x=prev.data;
        prev.next = null;
        System.out.println("element deleted");
      }

        return x;

    }

    // DELETE FROM KEY

    public void deleteKey( T key){
        node temp = this.head.next, prev = this.head;
        while (temp != null) {
            if(temp.data == key){
                prev.next = temp.next;
                System.out.println(key + " element deleted");
                break;
            }
            else{
                prev = temp;
                temp =temp.next;
            }
            
        }
    }

    public static void main(String[] args) {
        first <Integer> list = new first<Integer>();

        list.insertEnd(9);
        list.printList();
        list.insertfront(5);
        list.printList();
        list.insertEnd(10);
        list.printList();
        list.insertKey(7,5);
        list.printList();
        list.insertKey(8,4);
        list.printList();
        list.insertfront(14);
        list.printList();
        list.insertEnd(15);
        list.printList();

        // delete operations
        list.deleteFront();
        list.printList();
        list.deleteEnd();
        list.printList();

        list.deleteKey(7);
        list.printList();

        list.deleteKey(4);
        list.printList();

       


    }


}
