import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class TestRemoveDuplicates {

	
	@Test
	public void test1() {
		RemoveDuplicates rd=new RemoveDuplicates();
		ArrayList<Integer> actual=new ArrayList<Integer>();
		actual.add(84);
		actual.add(78);
		actual.add(78);
		
		 Set<Integer> resultSet = rd.removeDup(actual);

	        // Convert Set -> Array
	        Integer[] actual1 = resultSet.toArray(new Integer[0]);

	        // Expected
	        Integer[] expected = {84, 78};

	        // Compare
	        assertArrayEquals(expected, actual1);
	}
}