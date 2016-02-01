/**
 * Created by LuisPark on 2016. 2. 1..
 */
public class Dog implements Comparable<Dog> {
	int size;

	public Dog(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"size=" + size +
				'}';
	}

	@Override public int compareTo(Dog o) {
		return size - o.size;
	}
}
