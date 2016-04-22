import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import static java.lang.System.out;

public class wordPuzzle {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put ("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put ("template", "templates/results.vtl");

      String sentence = request.queryParams("userWord");
      String replacedSentence = makeWordPuzzle(sentence);

      model.put ("results", replacedSentence);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
  public static String makeWordPuzzle(String sentence) {
    String localWordVariable = sentence.toLowerCase();
    char[] charArray = localWordVariable.toCharArray();
    String results = "";

    HashMap<Character, Character> hm = new HashMap<Character, Character>();
    hm.put('a', '-');
    hm.put('b', 'b');
    hm.put('c', 'c');
    hm.put('d', 'd');
    hm.put('e', '-');
    hm.put('f', 'f');
    hm.put('g', 'g');
    hm.put('h', 'h');
    hm.put('i', '-');
    hm.put('j', 'j');
    hm.put('k', 'k');
    hm.put('l', 'l');
    hm.put('m', 'm');
    hm.put('n', 'n');
    hm.put('o', '-');
    hm.put('p', 'p');
    hm.put('q', 'q');
    hm.put('r', 'r');
    hm.put('s', 's');
    hm.put('t', 't');
    hm.put('u', '-');
    hm.put('v', 'v');
    hm.put('w', 'w');
    hm.put('x', 'x');
    hm.put('y', 'y');
    hm.put('z', 'z');
    hm.put(' ', ' ');
    for (char singleLetter : charArray) {
      results += hm.get(singleLetter);
    }
    return results;
  }
}
