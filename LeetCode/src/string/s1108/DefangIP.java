package string.s1108;

public class DefangIP {
	
	public static String defangIPaddr(String address) {
		
		StringBuilder dIPAddr = new StringBuilder();
		for(int i = 0; i <address.length();i++) {
			if(address.charAt(i)=='.'){
				dIPAddr.append("[.]");
			}else {
				dIPAddr.append(address.charAt(i));
			}
		}
		
		return dIPAddr.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(defangIPaddr("255.100.50.0"));
	}

}
