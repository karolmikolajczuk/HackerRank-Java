

class Printer
{
    public <T> void printArray(T[] thing) {
        for (T el : thing) {
            System.out.println(el);
        }
    }
 
}

