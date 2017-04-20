import org.junit.*;
import static org.junit.Assert.*;

// class declaration
public class ScrabbleScorerTest {

	// the first test
	@Test
	public void 	calculateScore_returnsScoreForSingleLetter_1() {
  	ScrabbleScorer testScrabble = new ScrabbleScorer();
  	Integer expected = 1;
  	assertEquals(expected, 	testScrabble.calculateScore("a"));
}


	@Test
	public void calculateScore_returnScoreForSingleLetter_2(){
		ScrabbleScorer testScrabble = new ScrabbleScorer();
		Integer expected = 1;
		assertEquals(expected, testScrabble.calculateScore(""));
	}
}
