

class Add {
    public void add(int...args) {
        int sum = 0;
        for(int i=0; i<args.length; i++) {
            if (i != args.length-1) {
                System.out.printf(args[i] + "+");
            } else {
                System.out.printf(args[i] + "=");
            }
            sum+=args[i];
        }
        System.out.println(sum);
    }
}

