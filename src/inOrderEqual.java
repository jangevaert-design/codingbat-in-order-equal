public class inOrderEqual {
  public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    return ((a < b && b < c && !equalOk) || (equalOk && a <= b && b <= c));
  }
}
