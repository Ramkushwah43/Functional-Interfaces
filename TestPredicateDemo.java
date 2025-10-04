import java.util.function.Predicate;
class TestPredicateDemo
{
	public static void main(String args[])
	{
		PredicateDemo<Integer> even1 = a->a%2==0;
		
		PredicateDemo<Integer> odd1 = a->a%2!=0;
		
		PredicateDemo<Integer> prime1 = a->{
			if(a<=1)return false;
			for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%i==0)return false;
			}
			return true;
		};
		PredicateDemo<Integer> palindrome1 = a -> {
			int a1 = a;
			int s = 0;
			while(a!=0)
			{
				s = s*10+a%10;
				a = a/10;
			}
			return a1==s;
		};
		
		
		
		
		Predicate<Integer> even = a->a%2==0;
		
		Predicate<Integer> odd = a->a%2!=0;
		
		Predicate<Integer> prime = a->{
			if(a<=1)return false;
			for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%i==0)return false;
			}
			return true;
		};
		Predicate<Integer> palindrome = a -> {
			int a1 = a;
			int s = 0;
			while(a!=0)
			{
				s = s*10+a%10;
				a = a/10;
			}
			return a1==s;
		};
		
		int n =101;
		
		System.out.println("DemoPredicate ---------------------------------");
		
		System.out.println(n+" is Even or Not : "+even1.test(n));//false
		System.out.println(n+" is Odd or Not : "+odd1.test(n));//true
		System.out.println(n+" is Prime or Not : "+prime1.test(n));//true
		System.out.println(n+" is Palindrome or Not : "+palindrome1.test(n));//true
		System.out.println(n+" is Even And Odd  : "+even1.and(odd1).test(n));//false
		System.out.println(n+" is Even OR Odd  : "+even1.or(odd1).test(n));//true
		System.out.println(n+" is NOT Even OR Odd  : "+even1.or(odd1).negate().test(n));//false
		System.out.println(n+" is NOT Even And Odd  : "+even1.and(odd1).negate().test(n));//true
		
		
		System.out.println("Predicate ---------------------------------");
		
		System.out.println(n+" is Even or Not : "+even.test(n));//false
		System.out.println(n+" is Odd or Not : "+odd.test(n));//true
		System.out.println(n+" is Prime or Not : "+prime.test(n));//true
		System.out.println(n+" is Palindrome or Not : "+palindrome.test(n));//true
		System.out.println(n+" is Even And Odd  : "+even.and(odd).test(n));//false
		System.out.println(n+" is Even OR Odd  : "+even.or(odd).test(n));//true
		System.out.println(n+" is NOT Even OR Odd  : "+even.or(odd).negate().test(n));//false
		System.out.println(n+" is NOT Even And Odd  : "+even.and(odd).negate().test(n));//true
		
	}
}

/**

DemoPredicate ---------------------------------
101 is Even or Not : false
101 is Odd or Not : true
101 is Prime or Not : true
101 is Palindrome or Not : true
101 is Even And Odd  : false
101 is Even OR Odd  : true
101 is NOT Even OR Odd  : false
101 is NOT Even And Odd  : true
Predicate ---------------------------------
101 is Even or Not : false
101 is Odd or Not : true
101 is Prime or Not : true
101 is Palindrome or Not : true
101 is Even And Odd  : false
101 is Even OR Odd  : true
101 is NOT Even OR Odd  : false
101 is NOT Even And Odd  : true

*/