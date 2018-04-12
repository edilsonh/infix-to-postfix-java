import java.util.*;
import javax.swing.*;

public class SortInfix {
  private ArrayList<String> infixAL = new ArrayList<>();

  public SortInfix(String[] a) {
    for (String s : a) {
      infixAL.add(s);
    }
  }

  public boolean checkInvalidTokens() {
    String it = "";
    try {
      for (String r : infixAL) {
        it = r;
        if (!isInteger(r) && !isOperator(r)) {
          System.out.println("Invalid token: " + r);
          throw new RuntimeException("Invalid token: " + r);
        }
      }
      return true;
    } catch (Exception e) {
      System.out.println(e);
      JFrame f = new JFrame();
      JOptionPane.showMessageDialog(f, "Cannot use token: " + it);
      return false;
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

  public String createInfix() {
    FileCreator fc = new FileCreator();
    while (operatorsExist()) {
      for (String opt : infixAL) {
        if (isOperator(opt)) {
          int ind = infixAL.indexOf(opt);
          fc.addContent(infixAL.get(ind), infixAL.get(ind-2), infixAL.get(ind-1));

          Tree t = new Operator(infixAL.get(ind),  new Operand(infixAL.get(ind-2)), new Operand(infixAL.get(ind-1)));

          infixAL.remove(ind);
          infixAL.remove(ind-1);

          infixAL.set(ind-2, t.toInfix());
          fc.addResult(t.toInfix());

          break;
        }
      }
    }
    fc.createFile();
    return infixAL.get(0);
  }
}
