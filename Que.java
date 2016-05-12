import java.util.LinkedList;
import java.util.Queue;

public class Que {

	public static void main(String[] args) {
		Queue queueA = new LinkedList();
		
		queueA.add("element 1");
		queueA.add("element 2");
		queueA.add("element 3");
		
		System.out.println(queueA);
		
		queueA.remove("element 2");
		
		System.out.println(queueA);

	}

}
