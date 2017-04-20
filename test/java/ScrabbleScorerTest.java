import org.junit.*;
import Static org.junit.Assert.*;

// class declaration
public class ScrabbleScorerTest {

	// the first test
	@Test
	public void calculateScore_returnScoreForSingleLetter_1(){
		Scrabble testScrabble = new Scrable();
		Integer expected = 1;
		assertEquals(expected, testScrabble.calculateScore("a"));
	}
}
