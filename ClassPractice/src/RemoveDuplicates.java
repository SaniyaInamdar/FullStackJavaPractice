import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public Set<Integer> removeDup(ArrayList<Integer> list) {
        return new LinkedHashSet<>(list); // LinkedHashSet order preserve karta hai
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(54);
		list.add(87);
		list.add(87);
		list.add(54);
		list.add(27);
		
		 RemoveDuplicates rd = new RemoveDuplicates();
	        Set<Integer> result = rd.removeDup(list);
	        System.out.println(result);  // Output: [54, 87, 27]
	}

}
