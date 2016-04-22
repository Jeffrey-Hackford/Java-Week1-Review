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
  }

  public static String makeWordPuzzle(String userWord) {
    String results = "";

    if (userWord.equals("a")) {
      results += "-";
    } else if (userWord.equals("i")) {
      results = "-";
    } else if (userWord.equals("b")) {
      return results;
    } else if (userWord.equals("word")) {
      results = userWord;
    }
    return results;
  }
}
