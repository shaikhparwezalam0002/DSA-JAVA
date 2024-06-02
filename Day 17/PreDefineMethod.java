public class PreDefineMethod{
    public static void main(String[] args) {
        /**
         * Math.abs();
         * Returns the absolute value of an int value. If the argument is not negative, the argument is returned. If the argument is negative, the negation of the argument is returned.
         */
        System.out.println(Math.abs(-20));// Return positive int value
        System.out.println(Math.abs(20));
        /**
         * Math.sqrt();
         */
        System.out.println(Math.sqrt(25));//retrun type is double.
        /**
         * Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer. 
         */
        System.out.println(Math.ceil(5.5)); //return type is double 
        /**
         * Returns the largest (closest to positive infinity) double value that is less than or equal to the     argument and is equal to a mathematical integer.
         */
        System.out.println(Math.floor(4.3));//return type is double
        /**
         * Returns the smaller of two int values.
         */
        System.out.println(Math.min(10,-20));
        /**
         * Returns the greater of two int values. 
         */
        System.out.println(Math.max(10,-200));
    }
}