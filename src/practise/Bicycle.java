package practise;




public class Bicycle {
	int cadence = 0;
    int speed = 0;
    int gear = 1;
// cadence,speed & gear  == Objects state
    // cahngeCadence, changeGear,speedUp, applyBrakes == methods
    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
   
    public interface Bicyclee {

        //  wheel revolutions per minute
        void changeCadence(int newValue);

        void changeGear(int newValue);

        void speedUp(int increment);

        void applyBrakes(int decrement);
    } 
    
    class ACMEBicycle implements Bicyclee {
    	int cadence = 0;
        int speed = 0;
        int gear = 1;

       // The compiler will now require that methods
       // changeCadence, changeGear, speedUp, and applyBrakes
       // all be implemented. Compilation will fail if those
       // methods are missing from this class.

      public  void changeCadence(int newValue) {
             cadence = newValue;
        }

        public void changeGear(int newValue) {
             gear = newValue;
        }

       public  void speedUp(int increment) {
             speed = speed + increment;   
        }

       public void applyBrakes(int decrement) {
             speed = speed - decrement;
        }

        void printStates() {
             System.out.println("cadence:" +
                 cadence + " speed:" + 
                 speed + " gear:" + gear);
           
        }
}
    }

