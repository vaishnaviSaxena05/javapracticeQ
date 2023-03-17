package Day4;

public class FirstAndLastElement {
    public static void main(String[] args) {
    	int [] arr = {34, 443, 34 ,32,232 ,324,44};
    	int firstName= arr[0];
    	
    	int lastName= arr[arr.length-1];
    	System.out.println("arrays fist element = "+ firstName);
    	System.out.println("arrays last element = "+ lastName);
	}
}
