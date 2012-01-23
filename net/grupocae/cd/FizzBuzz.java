package net.grupocae.cd;

/**
 * 
 * @author TonyMacross
 *
 */
public class FizzBuzz {
	public static void main(String[] args) {
		for(int i = 1; i<101; i++){
			System.out.print((i % 15 == 0 ? i+" - Fizz Buzz" : i % 3 == 0 ? i+" - Fizz" : i % 5 == 0 ? i+" - Buzz" : i)+"\n");
		}
	}
}
