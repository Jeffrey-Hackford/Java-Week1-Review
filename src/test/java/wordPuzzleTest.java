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
    assertEquals("-", testWordPuzzle.makeWordPuzzle("i"));
  }
  @Test
  public void isWordPuzzleTestB_makeWordPuzzle_b() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals(" ", testWordPuzzle.makeWordPuzzle("b"));
  }
  @Test
  public void isWordPuzzleTestWord_makeWordPuzzle_word() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("w-rd", testWordPuzzle.makeWordPuzzle("word"));
  }
}
