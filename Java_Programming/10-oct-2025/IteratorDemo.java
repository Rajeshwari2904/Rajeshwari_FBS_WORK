package p3;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Cities = new ArrayList<String>();
		Cities.add("Pune");
		Cities.add("Mumbai");
		Cities.add("Hyderabad");
		Cities.add("Nanded");
		
//		for(String city: Cities) {
//			
//			if (city.equals("Mumbai")) {
//				Cities.remove(city);
//			}
//		}
//		System.out.println("Cities");
//		
		System.out.println(Cities);
		
		Iterator<String> myit = Cities.iterator();
		
		while(myit.hasNext())
		{
			String city = (String) myit.next();
			if(city.equals("Mumbai"));
			myit.remove();
				
		}
		
		System.out.println(Cities);
	}

}
