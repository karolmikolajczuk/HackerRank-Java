

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        for(int i=0; i<(s.length()-k+1); i++)
        {
            if (smallest.compareTo(s.substring(i, k+i)) > 0) {
                smallest = s.substring(i, k+i);
            }
            if (largest.compareTo(s.substring(i, k+i)) < 0) {
                largest = s.substring(i, k+i);
            }
        }

        return smallest + "\n" + largest;
    }

