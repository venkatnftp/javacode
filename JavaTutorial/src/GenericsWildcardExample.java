import java.util.ArrayList;
import java.util.List;

public class GenericsWildcardExample {

	public static void main(String[] args) {

		List<? super A> list = new ArrayList<A>();

		list.add(new A());
		list.add(new B());
		list.add(new C(""));
		
		//list.add(new String());
		//list.add(new Object());
	}

}
