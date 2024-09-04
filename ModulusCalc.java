/**
 * Indicate your first and last name along with a description of this class
 * Evan Besoushko 
 * APCSA
 */
public class ModulusCalc {
    public static void main(String args[]){
        int number = 1234;
        int mod = 103;
        int result = number/mod;
        int modRes = number - (result*mod);
        System.out.println(modRes);


        /**
         * Implement your algorithm for calculating the modulus of any number 
         * without using the modulus operator.  For the above numbers, the result 
         * should be 101.  Test your algorithm against other values too! 
         */
    }
}
