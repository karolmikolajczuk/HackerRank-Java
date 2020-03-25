//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{

	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> phonebook = new HashMap<>();

		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phonebook.put(name, phone);
		}

		while(in.hasNext())
		{
			String s=in.nextLine();

            if (phonebook.containsKey(s) == false) {
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+phonebook.get(s));
            }
		}

	}
}



