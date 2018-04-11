class Operator extends Tree {
  private String operator;
  private String n1;
  private String n2;

  public Operand(String operator, String n1, String n2) {
      this.operator = operator;
      this.n1 = n1;
      this.n2 = n2;
  }

  public String toInfix() {
    return "(" + this.n1 + " " + this.operator + " " + this.n2 + ")";
  }
}
