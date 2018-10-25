public class SuperArray {


  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public void clear() {
    this.data = new String[(this.data).length];
    this.size = 0;
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public boolean add(String word) {
    if (data.length == this.size)
      resize();
    this.data[this.size] = word;
    this.size++;
    return true;
  }

  public String toString() {
    String a = "[";
    for(int i = 0; i < size; i++) {
        a += this.data[i];
        if (i != size - 1) {
        a += ", ";
        }
        }
        return a += "]";
      }

  public String toStringDebug() {
    String a = "[";
    for(int i = 0; i < data.length - 1; i++) {
      if (data[i] == null)
        a += "null, ";
      else a += data[i] + ", ";
    }
    if (data[data.length-1] == null)
      a += "null]";
    else a+= data[size] + "]";
    return a;
  }

  public String get(int index) {
    if (index < 0 || index >= size())
      return null;
    else return this.data[index];
  }

  public String set(int index, String word) {
    String old = "";
    if (index < 0 || index >= size())
      return null;
      else this.data[index] = word;
      return old;
    }

    private void resize() {
      String[] copy = new String[this.size * 2];
      for (int i = 0; i < size - 1; i++) {
        copy[i] = this.data[i];
      }
      this.data = copy;
    }


  }
