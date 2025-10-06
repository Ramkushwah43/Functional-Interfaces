import java.util.function.Function;

//TestFunctionDemo class checking for this same working Function interface or not
public class TestFunctionDemo
{
    public static void main(String[] args) 
	{

        // f1: multiply by 2
        Function<Integer, Integer> f1 = x -> {
            System.out.println("Inside f1: multiply by 2");
            return x * 2;
        };
		// fd1: multiply by 2
        FunctionDemo<Integer, Integer> fd1 = x -> {
            System.out.println("Inside fd1: multiply by 2");
            return x * 2;
        };

        // f2: add 10
        Function<Integer, Integer> f2 = x -> {
            System.out.println("Inside f2: add 10");
            return x + 10;
        };
        // fd2: add 10
        FunctionDemo<Integer, Integer> fd2 = x -> {
            System.out.println("Inside fd2: add 10");
            return x + 10;
        };

        // f3: square the number
        Function<Integer, Integer> f3 = x -> {
            System.out.println("Inside f3: square it");
            return x * x;
        };
        // fd3: square the number
        FunctionDemo<Integer, Integer> fd3 = x -> {
            System.out.println("Inside fd3: square it");
            return x * x;
        };

        System.out.println("Function Interface Test...");
        // -------- ANDTHEN CHAINING ----------
        System.out.println("---- Using Function interface andThen() method Chaining ----");
        Function<Integer, Integer> chain1 = f1.andThen(f2).andThen(f3);
        int result1 = chain1.apply(2);
        System.out.println("Final Result (andThen): " + result1);

        // -------- COMPOSE CHAINING ----------
        System.out.println("\n---- Using Function interface compose() method Chaining ----");
        Function<Integer, Integer> chain2 = f3.compose(f2).compose(f1);
        int result2 = chain2.apply(2);
        System.out.println("Final Result (compose): " + result2);
		
		// -------- COMPOSE + ANTDTHEN CHAINING ----------
        System.out.println("\n---- Using Function interface compose()+andThen() method Chaining ----");
        Function<Integer, Integer> chain3 = f3.compose(f2).compose(f1).andThen(f2).andThen(f1).compose(f1);
        int result3 = chain3.apply(2);
        System.out.println("Final Result (compose+andThen): " + result3);
		
		
        System.out.println("FunctionDemo Interface Test...");

        // -------- ANDTHEN CHAINING ----------
        System.out.println("---- Using FunctionDemo interface andThen() method Chaining ----");
        FunctionDemo<Integer, Integer> chain11 = fd1.andThen(fd2).andThen(fd3);
        int result11 = chain11.apply(2);
        System.out.println("Final Result (andThen): " + result11);

        // -------- COMPOSE CHAINING ----------
        System.out.println("\n---- Using FunctionDemo interface compose() method Chaining ----");
        FunctionDemo<Integer, Integer> chain22 = fd3.compose(fd2).compose(fd1);
        int result22 = chain22.apply(2);
        System.out.println("Final Result (compose): " + result22);
		
		// -------- COMPOSE + ANTDTHEN CHAINING ----------
        System.out.println("\n---- Using FunctionDemo interface compose()+andThen() method Chaining ----");
        FunctionDemo<Integer, Integer> chain33 = fd3.compose(fd2).compose(fd1).andThen(fd2).andThen(fd1).compose(fd1);
        int result33 = chain33.apply(2);
        System.out.println("Final Result (compose+andThen): " + result33);
    }
}

/**
O/P

Function Interface Test...
---- Using Function interface andThen() method Chaining ----
Inside f1: multiply by 2
Inside f2: add 10
Inside f3: square it
Final Result (andThen): 196

---- Using Function interface compose() method Chaining ----
Inside f1: multiply by 2
Inside f2: add 10
Inside f3: square it
Final Result (compose): 196

---- Using Function interface compose()+andThen() method Chaining ----
Inside f1: multiply by 2
Inside f1: multiply by 2
Inside f2: add 10
Inside f3: square it
Inside f2: add 10
Inside f1: multiply by 2
Final Result (compose+andThen): 668
FunctionDemo Interface Test...
---- Using FunctionDemo interface andThen() method Chaining ----
Inside fd1: multiply by 2
Inside fd2: add 10
Inside fd3: square it
Final Result (andThen): 196

---- Using FunctionDemo interface compose() method Chaining ----
Inside fd1: multiply by 2
Inside fd2: add 10
Inside fd3: square it
Final Result (compose): 196

---- Using FunctionDemo interface compose()+andThen() method Chaining ----
Inside fd1: multiply by 2
Inside fd1: multiply by 2
Inside fd2: add 10
Inside fd3: square it
Inside fd2: add 10
Inside fd1: multiply by 2
Final Result (compose+andThen): 668

**/