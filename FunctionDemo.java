// FunctionDemo
/**
	Internal Working of Predicate Functional Interface...
**/

public interface FunctionDemo<T,R>
{
	public abstract R apply(T t);
	
	public default <V>FunctionDemo<T,V> andThen(FunctionDemo<R,V> after)
	{
		//FunctionDemo<T,R> -------> this.apply(value)
		//FunctionDemo<R,V> -------> after.apply(value)
		//return FunctionDemo<T,V>
		
		return value-> after.apply(this.apply(value));
	}
	
	public default <V>FunctionDemo<V,R> compose(FunctionDemo<V,T> before)
	{
		//FunctionDemo<V,T> -------> before.apply(value)
		//FunctionDemo<T,R> -------> this.apply(value)
		//return FunctionDemo<V,R>
		
		return value -> this.apply(before.apply(value));
	}
	
	public static <T>FunctionDemo<T,T> identity()
	{
		return value -> value;
	}
}
