class Operand extends Tree {
  private String n;

  public Operand(String n) {
    this.n = n;
  }

  public String toInfix() {
    return this.n;
  }
}
