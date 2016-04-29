import org.junit.*;
import static org.junit.Assert.*;

public class wordPuzzleTest {

  @Test
  public void makeWordPuzzle_WillReturnDash_StringA() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("-", testWordPuzzle.makeWordPuzzle("a"));
  }
  @Test
  public void makeWordPuzzle_WillReturnDash_StringI() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("-", testWordPuzzle.makeWordPuzzle("i"));
  }
  @Test
  public void makeWordPuzzle_willReturnB_StringB() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("b", testWordPuzzle.makeWordPuzzle("b"));
  }
  @Test
  public void makeWordPuzzle_willReturnB_StringSpace_StringSpace() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals(" ", testWordPuzzle.makeWordPuzzle(" "));
  }
  @Test
  public void makeWordPuzzle_willReturnLowerCaseM_StringM() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("m", testWordPuzzle.makeWordPuzzle("M"));
  }
  @Test
  public void makeWordPuzzle_willReturnPuzzledWord_StringPuzzle() {
    wordPuzzle testWordPuzzle = new wordPuzzle();
    assertEquals("w-rd", testWordPuzzle.makeWordPuzzle("word"));
  }
}
