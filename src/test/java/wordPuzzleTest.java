import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzleTest {

  @Test
  public void isWordPuzzleTestA_makeWordPuzzle_a() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("-", testWordPuzzle.makeWordPuzzle("a"));
  }
  @Test
  public void isWordPuzzleTestI_makeWordPuzzle_i() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("-", testWordPuzzle.makeWordPuzzle("e"));
  }
}
