package practise;


public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
       }
		int[] numbers = 
            {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Counts is: " + item);
        }
        int[] arrayOfInts = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
	}

}

