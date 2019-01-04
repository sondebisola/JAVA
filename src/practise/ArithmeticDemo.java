package practise;



public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
 
 // "If someCondition is true, assign the value of value1 to result. Otherwise, assign the 
        //value of value2 to result."       
        int value1 = 1;
        int value2 = 2;
        int resultt;
        
        boolean someCondition = true;
        resultt = someCondition ? value1 : value2;

        System.out.println(resultt);
	}
}
        
       
	
        
        
	




