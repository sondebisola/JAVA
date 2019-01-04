package practise;

//The while statement evaluates expression, which must return a boolean value
//The difference between do-while and while is that do-while evaluates its expression 
// at the bottom of the loop instead of the top
public class whileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        
        
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    
	}

}
