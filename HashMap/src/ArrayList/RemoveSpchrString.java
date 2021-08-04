package ArrayList;

public class RemoveSpchrString {

	public static void main(String[] args) {
		
		String name = "B!a@n(g#lad^es%h*";
		
		// Regular Expression.....
		
		name = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(name);
	}
}
