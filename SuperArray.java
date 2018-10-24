public class SuperArray {


  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean add(String word) {
    if (data[size - 1] != null)
      resize();
    data[size] = word;
    size++;
    return true;
  }

  public String toString() {
    String a = "[";
    for(int i = 0; i < size-1; i++) {
      a += data[i] + ", ";
    }
    return a + data[size] + "]";
  }

  public String toStringDebug() {
    String a = "[";
    for(int i = 0; i < size-1; i++) {
      if (data[i].equals("null")) {
        a += "null, ";
      }
      else a += data[i] + ", ";
    }
    if (data[size].equals("null"))
      return a + "null" + "]";
    else return a + data[size] + "]";
  }

  public String get(int index) {
    if (index < 0 || index >= size())
      return null;
    else return data[index];
  }

  public String set(int index, String word) {
    String temp = "";
    String old = "";
    if (index < 0 || index >= size())
      return null;
      else {
        old = data[index];
        temp = word;
        data[index] = word;
      }
      return old;
    }

    private void resize() {
      String[] copy = new String[size * 2];
      for (int i = 0; i < size - 1; i++) {
        copy[i] = data[i];
      }
      data = copy;
    }


  }
