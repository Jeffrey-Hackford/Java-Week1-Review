import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

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
      Char[] charArray = sentence.toCharArray();
      String replacedSentence = charArray.makeWordPuzzle(charArray);


      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String makeWordPuzzle(String userWord) {
    String results = "";
    for (int i=0; i < userWord.length(); i++) {
      if (userWord.equals("a")) {
        results += "-";
      } else if (userWord.equals("e")) {
        results += "-";
      } else if (userWord.equals("i")) {
        results += "-";
      } else if (userWord.equals("o")) {
        results += "-";
      } else if (userWord.equals("u")) {
        results += "-";
      } else {
        results += i;
      }
    }
    return results;
  }
}
