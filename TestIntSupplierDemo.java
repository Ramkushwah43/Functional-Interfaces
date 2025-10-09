import java.util.function.IntSupplier;
import java.util.function.Consumer;
class TestIntSupplierDemo
{
	public static void main(String args[])
	{
		IntSupplier s1 = ()->1001;
		IntSupplier s2 = ()->1002;
		Consumer<Integer> c1 = value -> System.out.println("Supplier s1 : "+value);
		Consumer<Integer> c2 = value -> System.out.println("Supplier s2 : "+value);
		
		c1.accept(s1.getAsInt());
		c2.accept(s2.getAsInt());
		
		IntSupplierDemo sd1 = ()->1001;
		IntSupplierDemo sd2 = ()->1002;
		ConsumerDemo<Integer> cd1 = value -> System.out.println("Supplier sd1 : "+value);
		ConsumerDemo<Integer> cd2 = value -> System.out.println("Supplier sd2 : "+value);
		
		cd1.accept(sd1.getAsInt());
		cd2.accept(sd2.getAsInt());
	}
}