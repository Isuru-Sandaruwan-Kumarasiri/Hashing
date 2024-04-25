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
    public void insertRear(int data){
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
        while(temp!=null){
            if(temp.getData()==data){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }
    public void insertAtPosition(int pos ,int data){
        Node newNode =new Node(data);
        Node temp=this.head;
        if (head==null){
            this.head=newNode;
            this.tail=newNode;
        }else{
            for(int i=1;i<pos-1;i++){
                temp=temp.getNext();
            }
            Node afterPosnode=temp.getNext();
            temp.setNext(newNode);
            newNode.setNext(afterPosnode);
        }
    }
    public void deleteNode(int data){
        Node temp=this.head;
        if(search(data)){
            while (temp.getNext().getData()!=data){
                temp=temp.getNext();
            }
            Node afterNode=temp.getNext().getNext();
            temp.getNext().setNext(null);
            temp.setNext(afterNode);
        }

    }
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.getData()+",");
            temp=temp.getNext();
        }
        System.out.println();
    }




}
