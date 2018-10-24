public class SuperArray {


  private String[] data
  private int size

  public SuperArray() {
    data = new String[10]
    size = 0;
  }

  public void clear() {
    size = 0
  }

  public boolean isEmpty() {
    return size == 0;
  }


}
