public class HashTable {
    LinkedList[] hashTable =new LinkedList[5];

    private int hashcode(int data){return data%5;}

    public void insertData(int data){
        int index=hashcode(data);
        if(hashTable[index]==null){
            LinkedList temp=new LinkedList();
            temp.insertRear(data);
            hashTable[index]=temp;
        }else {
            LinkedList existList=hashTable[index];
            existList.insertRear(data);
        }
    }
    public void retrieve(int data){
        int index=hashcode(data);
        if(hashTable[index]==null){
            System.out.println("Not Found");
        }else{
            LinkedList temp=hashTable[index];
            temp.deleteNode(data);
        }
    }

    public void Display(){
        for (int i = 0; i < 5; i++) {
            LinkedList temp = hashTable[i];
            if (temp != null) {
                temp.display();
                System.out.println();
            }
        }
    }
}
