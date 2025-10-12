import java.util.Set;
import java.util.TreeSet;

public class DemoYunhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1 = new TreeSet();
		s1.add("Vinayak");
		s1.add("XYZ");
		s1.add("abcd");
		
		
		for(Object obj: s1) {     // for each loop
			
			String str = (String) obj;
			System.out.println(str.length());
			
		}

	}

}
