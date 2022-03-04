package com.company;
import java.util.function.Predicate;
public class StartWithK {
	public static void main(String[] args) {
	
		Predicate<String> p1 = ch -> {
		boolean result = false;
		for(int i=0;i<ch.length();i++)
		{
         if(ch.charAt(0)=='K') {			
        	result = true;
         }
         else
         {
        	 return false;
         }
		}
		return result;
		};
		
		System.out.println(p1.test("Kamlesh"));
		System.out.println(p1.test("Vivek"));
		System.out.println(p1.test("Kiran"));
		System.out.println(p1.test("Suman"));

	}

}