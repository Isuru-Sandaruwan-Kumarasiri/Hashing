public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = this.tail=null;

    }
    public void insertFront(int data){
        Node newNode=new Node(data);
        if(this.head==null){
            this.tail=this.head=newNode;
        }else{
            newNode.setNext(this.head);
            this.head=newNode;
        }
    }
    public void InsertRear(int data){
        Node newNode=new Node(data);
        if(this.tail==null){
            this.tail=newNode;
            this.head=newNode;

        }else {
            tail.setNext(newNode);
            tail=newNode;
        }
    }

}
