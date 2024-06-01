package linkedlist.ll706;

public class HashMapSimple {
	private int[] MAXVAL;
	public HashMapSimple() {
		MAXVAL = new int[1000001];
	}
	
	public void put(int key, int value) {
		MAXVAL[key] = value;
	}
	
	public int get(int key) {
		return MAXVAL[key];
	}
	
	public void remove(int key) {
		MAXVAL[key] = -1;
	}

}
