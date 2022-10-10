import java.util.*;

public class GFG {

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Muzamil");
		ll.add("Ahmed");
		ll.add(1, "Dayo");

		System.out.println("Initial LinkedList " + ll);

		// Function call
		ll.remove(1);

		System.out.println("After the Index Removal " + ll);

		ll.remove("Geeks");

		System.out.println("After the Object Removal "
						+ ll);
	}
}
