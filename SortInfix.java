import java.util.*;

public class SortInfix {
  private ArrayList<String> infixAL = new ArrayList<>();

  public SortInfix(String[] a) {
    for (String s : a) {
      infixAL.add(s);
    }
    System.out.println(infixAL);
  }

  public void checkInvalidTokens() {
    for (String r : infixAL) {
      if (!isInteger(r) && !isOperator(r)) {
        System.out.println("Invalid token: " + r);
      }
    }
  }

  public boolean operatorsExist() {
    int totalOperators = 0;
    for (String m : infixAL) {
      if (isOperator(m)) {
        totalOperators++;
      }
    }
    if (totalOperators > 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isInteger(String k) {
    try {
      Integer.parseInt(k);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public boolean isOperator(String g) {
    if (g.equals("+")) {
      return true;
    } else if (g.equals("-")) {
      return true;
    } else if (g.equals("*")) {
      return true;
    } else if (g.equals("/")) {
      return true;
    } else {
      return false;
    }
  }

  public void createInfix() {
    while (operatorsExist()) {
      for (String opt : infixAL) {
        if (isOperator(opt)) {
          int ind = infixAL.indexOf(opt);
          System.out.println(ind);
          System.out.print(infixAL.get(ind-1));
          System.out.print(infixAL.get(ind));
          System.out.print(infixAL.get(ind-2));
          infixAL.remove(ind);
          break;
        }
      }
    }
  }

}
