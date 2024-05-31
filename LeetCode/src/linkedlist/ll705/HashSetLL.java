package linkedlist.ll705;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashSetLL {
	
	private int MAXVAL = 1000000;
	private int ARRAYSIZE = 100;	
	private List<List<Integer>> parentList;	
	
	public HashSetLL() {
		parentList = new ArrayList<>(ARRAYSIZE);
		parentList.addAll(null);
	}
	
	public void add(int key) {
		int index = key%ARRAYSIZE;
		List<Integer> childList = parentList.get(index);
		if(childList== null) {
			List<Integer> list = new LinkedList<>();
			list.add(key);
			parentList.set(index, list);
		}else {
			if(!childList.contains(key)) {
				childList.add(key);
			}
		}
		
		
	}
	
	public void remove(int key) {
		int index = key%ARRAYSIZE;
		List<Integer> childList = parentList.get(index);
		if((childList!=null)&&(childList.contains(key))) {
			childList.remove(Integer.valueOf(key));
		}
	}
	
	public boolean contains(int key) {
		int index = key%ARRAYSIZE;
		List<Integer> childList = parentList.get(index);
		
		return childList!=null && childList.contains(key);

	}

}
