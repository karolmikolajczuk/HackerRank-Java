

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] ascii_a = new int[129];
        int[] ascii_b = new int[129];
        
        for (int i=0; i<a.length(); i++) {
            ascii_a[(int)a.charAt(i)]++;
            ascii_b[(int)b.charAt(i)]++;
        }

        for (int i=32; i<=128; i++) {
            if (ascii_a[i] != ascii_b[i]) {
                return false;
            }
        }

        return true;
    }

