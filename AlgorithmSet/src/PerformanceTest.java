import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by LuisPark on 2016. 2. 2..
 */
public class PerformanceTest {

	public static void main(String[] args) {
		Random random = new Random();

		TreeSet dogTreeSet = new TreeSet();
		HashSet dogHashSet = new HashSet();
		LinkedHashSet dogLinkedHashSet = new LinkedHashSet();

		// start time
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = random.nextInt(1000 - 10) + 10;
			dogHashSet.add(new Dog(x));
		}
		// end time
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: " + duration);

		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = random.nextInt(1000 - 10) + 10;
			dogTreeSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);

		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = random.nextInt(1000 - 10) + 10;
			dogLinkedHashSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);
	}
}
