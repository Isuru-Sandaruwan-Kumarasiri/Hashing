//S/20/426
public class Main {


        public static void main(String[] args) {

            Hash hashing = new Hash();

            hashing.insertData(5);
            hashing.insertData(10);
            hashing.insertData(20);
            hashing.insertData(1);
            hashing.insertData(0);
            hashing.insertData(100);
            hashing.insertData(13);
            hashing.insertData(21);

            hashing.Display();

            hashing.retrieve(100);

            hashing.Display();



    }
}