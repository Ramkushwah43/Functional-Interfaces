// Consumer interface
/**
	Internal Working of Consumer Functional Interface...
**/
public interface ConsumerDemo<T>
{
	// One Abstract Method void accept(T t);
	public abstract void accept(T t);
	
	//Internal working of andThen() method
	public default ConsumerDemo<T> andThen(ConsumerDemo<T> after)
	{
		// pehle vo method call hogi jiss object ke correspondeing call kiya hai
           // then vo call hogi jise call kiya hai 		
		return val -> {
			//Write seprate because they does not return anyhting...
			this.accept(val);
			after.accept(val);
		};
	}
}