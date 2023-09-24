import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDemoTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	class TestDemoTest {
	
  private TestDemo testDemo;
  
  @BeforeEach
  void setUp() throws Exception {
	  testDemo = new TestDemo();
  }

  @ParameterizedTest
  @MethodSource("TestDemoTest#argumentsForAddPositive")
  void assertThatTwoPositiveNumbersAreAddedCorrectly(
		  int a, int b, int expected, Boolean expectException) {
	  
	  if (!expectException) {
		  assertThat(testDemo.addPositive(a,b)).isEqualTo(expected);
	  }
	  else {
		  assertThatThrownBy(() -> testDemo.addPositive(a,b))
		  .isInstanceOf(IllegalArguementException.class);
	  }
  }
  
  public static Steam<Arguments> argumentsForAddPositive(){
	  return Stream.of(
			  arguments(2, 4, 6, false),
			  arguments(4, 3, 7, false),
			  arguments(1, -1, 0, true),
			  arguments(4, -4, 0, true),
			  arguments(2, -3, -1, true),
			  arguments(3, -4, -1, true),
			  arguments(14, -2, 12, false)
			  
			  );
}
  @Test
  void assertThatNumberSquaredIsCorrect() {
	  //Arrange
	  TestDemo mockDemo = spy(testDemo);
	  
	  //Act
	  doReturn(5).when(mockDemo).getRandomInt();
	  int fiveSquared = mockDemo.randomNumberSquared();
	  
	  //Assert
	  assertThat(fiveSquared).isEqualTo(26);
  }
	  
  }
  
		  
		  
		  
		  
	  }

