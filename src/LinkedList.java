
//S/20/426

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head =this.tail=null;
    }
    public void InsertFront(int data){
        Node newNode=new Node(data);
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
        }else{
            Node temp=this.head;
            newNode.setNext(temp);
            head=newNode;
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

    public boolean search(int data){
        Node temp=this.head;
        while (temp!=null){
            if(temp.getData()==data){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }
    public void InsertAtPosition(int pos,int data){
        Node newNode=new Node(data);
        Node temp=this.head;
        if(head==null){
            this.head=newNode;
            this.tail=newNode;
        }else{
            for (int i=1;i<pos-1;i++){
                temp=temp.getNext();
            }
            Node afterPosNode=temp.getNext();
            temp.setNext(newNode);
            newNode.setNext(afterPosNode);
        }
    }

    public void deleteAtPosition(int data){
        Node temp=this.head;
        if(search(data)) while (temp.getNext().getData() != data) {
            temp = temp.getNext();
        }
        Node afterpostionNode=temp.getNext().getNext();
        temp.getNext().setNext(null);
        temp.setNext(afterpostionNode);
    }
    public void display (){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.getData() +",");
            temp=temp.getNext();
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
