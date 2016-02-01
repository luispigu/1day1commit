import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by LuisPark on 2016. 2. 2..
 */
public class HashSetTest {

	public static void main(String args[]) {
		HashSet dogHashSet = new HashSet();
		dogHashSet.add(new Dog(2));
		dogHashSet.add(new Dog(1));
		dogHashSet.add(new Dog(4));
		dogHashSet.add(new Dog(3));
		dogHashSet.add(new Dog(5));

		Iterator<Dog> iterator = dogHashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + "\n");
		}
	}
}
