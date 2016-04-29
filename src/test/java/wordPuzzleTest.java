import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzleTest {

  @Test
  public void isWordPuzzleTestA_makeWordPuzzle_StringA() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("-", testWordPuzzle.makeWordPuzzle("a"));
  }
  @Test
  public void isWordPuzzleTestI_makeWordPuzzle_StringI() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("-", testWordPuzzle.makeWordPuzzle("i"));
  }
  @Test
  public void isWordPuzzleTestB_makeWordPuzzle_StringB() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("b", testWordPuzzle.makeWordPuzzle("b"));
  }
  @Test
  public void isWordPuzzleTestSpace_makeWordPuzzle_StringSpace() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals(" ", testWordPuzzle.makeWordPuzzle(" "));
  }
  @Test
  public void isWordPuzzleTestB_makeWordPuzzle_StringLowerCaseM() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("M", testWordPuzzle.makeWordPuzzle("m"));
  }
  @Test
  public void isWordPuzzleTestWord_makeWordPuzzle_word() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("w-rd", testWordPuzzle.makeWordPuzzle("word"));
  }
}
