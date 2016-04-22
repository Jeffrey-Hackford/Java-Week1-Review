import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzleTest {

  @Test
  public void isWordPuzzleTest_makeWordPuzzle_true() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("-", testWordPuzzle.makeWordPuzzle("e"));
  }
}
