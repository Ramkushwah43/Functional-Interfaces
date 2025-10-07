import java.util.function.Consumer;
//TestConsumerDemo class checking for this same working Consumer interface or not
class TestConsumerDemo
{
	public static void main(String args[])
	{
		// -------- PREDEFINED CONSUMER FUNCTION ----------
		System.out.println("----------REDEFINED CONSUMER FUNCTION------------");
		Consumer<String> c1 = a -> System.out.println(a); 		
		Consumer<Integer> c2 = a -> System.out.println("Value Of Variable : "+a);
		Consumer<Integer> c3 = b -> System.out.println("Value Of Variable : "+b);
		Consumer<Integer> c4 = c2.andThen(c3);
		Consumer<Integer> c5 = c2.andThen(c4).andThen(c2).andThen(c3);
		
		c4.accept(10);
		c5.accept(11);
		
		// ----------USER-REDEFINED CONSUMERDEMO FUNCTION------------
		System.out.println("----------USER-REDEFINED CONSUMERDEMO FUNCTION------------");
		ConsumerDemo<String> c11 = a -> System.out.println(a); 
		ConsumerDemo<Integer> c22 = a -> System.out.println("Value Of Variable : "+a);
		ConsumerDemo<Integer> c33 = b -> System.out.println("Value Of Variable : "+b);
		ConsumerDemo<Integer> c44 = c22.andThen(c33);
		ConsumerDemo<Integer> c55 = c22.andThen(c44).andThen(c22).andThen(c33);
		
		c44.accept(10);
		c55.accept(11);
	}
}