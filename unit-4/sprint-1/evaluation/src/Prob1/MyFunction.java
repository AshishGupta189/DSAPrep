package Prob1;

import java.util.function.Function;

public class MyFunction implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return Integer.parseInt(t);
	}

	

}
