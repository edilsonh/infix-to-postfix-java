import java.util.*;

public class SortInfix {
  private ArrayList<String> infixAL = new ArrayList<>();

  public SortInfix(String[] a) {
    for (String s : a) {
      infixAL.add(s);
    }
    System.out.println(infixAL);
  }

}
