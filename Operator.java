class Operator extends Tree {
  private String operator;
  private Operand n1;
  private Operand n2;

  public Operator(String operator, Operand n1, Operand n2) {
      this.operator = operator;
      this.n1 = n1;
      this.n2 = n2;
  }

  public String toInfix() {
    return "(" + n1.toInfix() + operator + n2.toInfix() + ")";
  }
}
