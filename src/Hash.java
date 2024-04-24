
//S/20/426
public class Hash {

        LinkedList hashingArray[] = new LinkedList[5];

        public int hashCode(int data) {
            return data % 5;
        }

        public void insertData(int data) {

            int index = hashCode(data);

            if (hashingArray[index] == null) {
                LinkedList temp = new LinkedList();
                hashingArray[index] = temp;
                temp.InsertRear(data);
            } else {
                LinkedList temp = hashingArray[index];
                temp.InsertRear(data);
            }
        }

        public void retrieve(int data) {

            int index = hashCode(data);

            if (hashingArray[index] == null) {
                System.out.println("Item Not Found");
            } else {
                hashingArray[index].deleteAtPosition(data);
            }
        }

        public void Display() {
            for (int i = 0; i < 5; i++) {
                LinkedList temp = hashingArray[i];
                if (temp != null) {
                    temp.display();
                    System.out.println();
                }
            }
        }

        public void search(int target) {

            int index = hashCode(target);

            if (hashingArray[index] == null) {
                System.out.println("Item Not Exist");

            } else {
                LinkedList temp =hashingArray[index];
                Node current = temp.getHead();

                while (current != null) {
                    if (current.getData() == target) {
                        System.out.println("Item Found");
                        return;
                    }
                    current = current.getNext();
                }
                System.out.println("Item Not Exist");
            }
        }

}

