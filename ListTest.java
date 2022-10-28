import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class ListTest {

	@Test 
	public void merging() {
		List<String> myList = new ArrayList<>();
		myList.add("a");
		myList.add("b");
		myList.add("k");
		
		
		List<String> myList2 = new ArrayList<>();
		myList2.add("ba");
		myList2.add("d");
		myList2.add("e");
		
		
		List<String> mergedList = new ArrayList<>();
		mergedList.add("a");
		mergedList.add("b");
		mergedList.add("ba");
		mergedList.add("d");
		mergedList.add("e");
		mergedList.add("k");
		
		assertEquals(mergedList, ListExamples.merge(myList, myList2));
		
				
	}
  
  
  
}
