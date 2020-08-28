package qq;

import java.util.function.Function;

class MulWithFunction {
	public static void main(String args[]) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(9));
	}
}
