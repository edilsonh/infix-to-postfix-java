import java.util.*;

public class FileCreator {
  private String f;
  private int counter = 0;
  private ArrayList<String> allResults = new ArrayList<>();

  public FileCreator(){
    f = "";
  }

  public void addResult(String rslt) {
    allResults.add(rslt);
  }

  public void addContent(String opt, String k1, String k2) {
    switch (opt) {
      case "+" :
        f += "Add ";
        break;

      case "-" :
        f += "Sub ";
        break;

      case "*" :
        f += "Mul ";
        break;

      case "/" :
        f += "Div ";
        break;
    }

    f += "R" + Integer.toString(counter) + " ";

    if (allResults.indexOf(k1) == -1) {
      f += k1 + " ";
    } else {
      int r = allResults.indexOf(k1);
      f += "R" + r + " ";
    }

    if (allResults.indexOf(k2) == -1) {
      f += k2;
    } else {
      int r = allResults.indexOf(k2);
      f += "R" + r;
    }

    f += "\n";

    counter++;
  }

  public String giveResult() {
    return f;
  }
}
