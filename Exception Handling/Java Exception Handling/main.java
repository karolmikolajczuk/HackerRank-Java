
class MyCalculator {

    public long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        long pow = n;

        if (p == 0) return 1;
        else if (p == 1) return n;
        
        for (int i=1; i<p; i++) {
            pow *= n;
        }

        return pow;
    }

}

