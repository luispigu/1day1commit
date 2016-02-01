import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by LuisPark on 2016. 2. 1..
 */

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet dogSet = new TreeSet();
		dogSet.add(new Dog(1));
		dogSet.add(new Dog(2));
		dogSet.add(new Dog(3));
		dogSet.add(new Dog(4));
		dogSet.add(new Dog(5));

		Iterator<Dog> iterator = dogSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + "\n");
		}
	}
}
