import java.util.function.Supplier;
import java.util.function.Consumer;
class TestSupplierDemo
{
	public static void main(String args[])
	{
		Supplier<Integer> s1 = ()->1001;
		Supplier<Integer> s2 = ()->1002;
		Consumer<Integer> c1 = value -> System.out.println("Supplier s1 : "+value);
		Consumer<Integer> c2 = value -> System.out.println("Supplier s2 : "+value);
		
		c1.accept(s1.get());
		c2.accept(s2.get());
		
		SupplierDemo<Integer> sd1 = ()->1001;
		SupplierDemo<Integer> sd2 = ()->1002;
		ConsumerDemo<Integer> cd1 = value -> System.out.println("Supplier sd1 : "+value);
		ConsumerDemo<Integer> cd2 = value -> System.out.println("Supplier sd2 : "+value);
		
		cd1.accept(sd1.get());
		cd2.accept(sd2.get());
	}
}