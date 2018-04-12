import java.util.*;

public class FileCreator {
  private String f;
  private int counter = 0;
  private ArrayList<String> rr = new ArrayList<>();

  public FileCreator(){
    f = "";
  }

  public void addResult(String rslt) {
    rr.add(rslt);
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

    if (rr.indexOf(k1) == -1) {
      f += k1 + " ";
    } else {
      int r = rr.indexOf(k1);
      f += "R" + r + " ";
    }

    if (rr.indexOf(k2) == -1) {
      f += k2;
    } else {
      int r = rr.indexOf(k2);
      f += "R" + r;
    }

    f += "\n";

    counter++;
  }

  public String giveResult() {
    return f;
  }
}
