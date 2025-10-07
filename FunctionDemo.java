// Function interface
/**
	Internal Working of Function Functional Interface...
**/

public interface FunctionDemo<T,R>
{
	//One Abstract Method R apply(T t);
	public abstract R apply(T t);
	
	//Internal working of andThen() method
	public default <V>FunctionDemo<T,V> andThen(FunctionDemo<R,V> after)
	{
		//FunctionDemo<T,R> -------> this.apply(value)
		//FunctionDemo<R,V> -------> after.apply(value)
		//return FunctionDemo<T,V>
		
		return value-> after.apply(this.apply(value));
	}
	
	//Internal working of compose() method
	public default <V>FunctionDemo<V,R> compose(FunctionDemo<V,T> before)
	{
		//FunctionDemo<V,T> -------> before.apply(value)
		//FunctionDemo<T,R> -------> this.apply(value)
		//return FunctionDemo<V,R>
		
		return value -> this.apply(before.apply(value));
	}
	
	//Internal working of indentity() method
	public static <T>FunctionDemo<T,T> identity()
	{
		//this return same value as it is
		return value -> value;
	}
}
