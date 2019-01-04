package practise;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub declares an array of integers
        //int[] anArray;

        // allocates memory for 10 integers
     // anArray = new int[10];
													//java.util.Arrays.
												//java.lang.String.
		
        int[] anArray  = new int[10];
        
        // initialize all 10 element
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
       // int[] anArraay  = new int[10];
        int[] anArraay = { 
        	    100, 200, 300,
        	    400, 500, 600, 
        	    700, 800, 900, 1000
        	};

        System.out.println("Element at index 0: "+ anArray[0]);
        System.out.println("Element at index 1: "+ anArray[1]);                           
        System.out.println("Element at index 2: "+ anArray[2]);                           
        System.out.println("Element at index 3: " + anArray[3]);                       
        System.out.println("Element at index 4: "+ anArray[4]);                           
        System.out.println("Element at index 5: "+ anArray[5]);                           
        System.out.println("Element at index 6: "+ anArray[6]);                           
        System.out.println("Element at index 7: "+ anArray[7]);                           
        System.out.println("Element at index 8: "+ anArray[8]);                           
        System.out.println("Element at index 9: "+ anArray[9]);                               

        
// a multidimensional array is an array whose components are themselves arrays.
//A consequence of this is that the rows are allowed to vary in length
        
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
            };
            // Mr. Smith
            System.out.println(names[0][0] + names[1][0]);
            // Ms. Jones
            System.out.println(names[0][2] + names[1][1]);
            System.out.println(anArray.length);
            
            //method to copy from one array to  another
            //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            
             /*The two Object arguments specify the array to copy from and the array to copy to.
            The three int arguments specify the starting position in the source array, 
            the starting position in the destination array, and the number of array elements to copy  */    
            
            char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
    			    'i', 'n', 'a', 't', 'e', 'd' };
            char[] copyTo = new char[7];

            System.arraycopy(copyFrom, 2, copyTo, 0, 7);
            System.out.println(new String(copyTo));
            
       
                
                char[] copyFrrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd'};
                    
                char[] copyToo = java.util.Arrays.copyOfRange(copyFrrom, 2, 9);
                
                System.out.println(new String(copyToo));
            
        }      	
}


