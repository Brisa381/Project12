package com.promineotech;

public class TestDemo {
	public int add; int positive(int a, int b) {
		if(a > 0 && b > 0) {
			return a+b;
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive");
		}
	}

public int randomNumberSquared() {
	int randomNumber = getRandomInt();
	int result = randomNumber * randomNumber;
	return result;
}
	
public int getRandomInt() {
		// TODO Auto-generated method stub
	Random random = new Random();
		return random.nextInt(10) + 1;
	}

}


