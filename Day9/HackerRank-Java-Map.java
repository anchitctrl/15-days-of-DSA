import java.util.*;
import java.io.*;
class Solution{
	public static void main(String []argh)
	{
        HashMap<String,Integer> map=new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            map.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(map.get(s)==null){
                System.out.println("Not found");
                continue;
            }
            System.out.println(s+"="+map.get(s));
		}
	}
}
