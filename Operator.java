class Operator extends Tree {
  private String operator;
  private String n1;
  private String n2;

  public Operator(String operator, String n1, String n2) {
      this.operator = operator;
      this.n1 = n1;
      this.n2 = n2;
  }

  public String toInfix() {
    return "(" + n1 + operator + n2 + ")";
  }
}
