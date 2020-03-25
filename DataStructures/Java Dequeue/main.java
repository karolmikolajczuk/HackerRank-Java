    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> hashset = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int global_count = Integer.MIN_VALUE;
            
            if (m>n) return;
            if (m==1) { 
                System.out.println(1);
                return;
            }

            for (int i = 0; i < n; i++) {
                int input = in.nextInt();
                deque.add(input);
                hashset.add(input);

                if (i >= (m-1)) {
                    if (hashset.size() > global_count) global_count = hashset.size();
                    int removed_element = deque.remove();
                    if (!deque.contains(removed_element)) hashset.remove(removed_element);                    
                }
            }
    
            System.out.println(global_count);
        }
    }

