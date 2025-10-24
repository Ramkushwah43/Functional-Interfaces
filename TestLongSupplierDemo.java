import java.util.function.LongSupplier;
import java.util.function.Consumer;
class TestLongSupplierDemo
{
	public static void main(String args[])
	{
		LongSupplier s1 = ()->1001;
		LongSupplier s2 = ()->1002;
		Consumer<Integer> c1 = value -> System.out.println("Supplier s1 : "+value);
		Consumer<Integer> c2 = value -> System.out.println("Supplier s2 : "+value);
		
		c1.accept(s1.getAsLong());
		c2.accept(s2.getAsLong());
		
		LongSupplierDemo sd1 = ()->1001;
		LongSupplierDemo sd2 = ()->1002;
		ConsumerDemo<Integer> cd1 = value -> System.out.println("Supplier sd1 : "+value);
		ConsumerDemo<Integer> cd2 = value -> System.out.println("Supplier sd2 : "+value);
		
		cd1.accept(sd1.getAsLong());
		cd2.accept(sd2.getAsLong());
	}
}