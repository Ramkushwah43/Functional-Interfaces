// PredicateDemo
/**
	Internal Working of Predicate Functional Interface...
*/
@FunctionalInterface
public interface PredicateDemo<T>
{
	public abstract boolean test(T t);
	
	//Internal Working of and() method
	public default PredicateDemo<T> and(PredicateDemo<T> pd)
	{
		//this.test() method calling to current object corresponding 
		return value-> this.test(value) && pd.test(value);
	}
	
	//Internal Working of or() method
	public default PredicateDemo<T> or(PredicateDemo<T> pd)
	{
		//this.test() method calling to current object corresponding 
		return value-> this.test(value) || pd.test(value);
	}
	
	//Internal Working of negate() method
	public default PredicateDemo<T> negate()
	{
		//this.test() method calling to current object corresponding 
		return value-> !this.test(value);
	}
	
	public static <T>PredicateDemo<T> isEqual(String str)
	{
		//isEquals() method internally use equals() method they are overidden in String class 
		return value -> str.equals(value);
	}
}
