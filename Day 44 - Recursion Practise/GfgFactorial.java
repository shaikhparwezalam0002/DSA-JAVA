//Find all factorial numbers less than or equal to n

class GfgFactorial {
    public static void generateFactorials(long current, long factorial, long n, ArrayList<Long> al) {
        if (factorial > n) {
            return;
        }
        al.add(factorial);
        generateFactorials(current + 1, factorial * (current + 1), n, al);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code 
        ArrayList<Long> al=new ArrayList<>();
        generateFactorials(1,1,n,al);
        return al;
    }
}
