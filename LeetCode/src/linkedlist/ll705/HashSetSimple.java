package linkedlist.ll705;

import java.util.Arrays;

public class HashSetSimple {

	boolean[] MAXVAL;
	
	public HashSetSimple() {
		MAXVAL = new boolean[1000001];
	}
	
	public void add(int key) {
		MAXVAL[key] = true;
	}
	
	public void remove(int key) {
		MAXVAL[key] = false;
	}
	
	public boolean contains(int key) {
		
		return MAXVAL[key];
	}
}
