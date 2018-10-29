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
    for(int i = 0; i < this.size; i++) {
      a += this.data[i];
      if (i != size - 1)
        a += ", ";
      }
      return a += "]";
    }

  public String toStringDebug() {
    String a = "[";
    for(int i = 0; i < this.data.length - 1; i++) {
      a += this.data[i];
      if (i != size - 1)
        a += ", ";
      }
      return a += "]";
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
      String[] copy = new String[this.size * 2 + 1];
      for (int i = 0; i < size; i++) {
        copy[i] = this.data[i];
      }
      this.data = copy;
    }

    public boolean contains(String word) {
      for (int i = 0; i < size; i++) {
        if (data[i].equals(word))
          return true;
      }
      return false;
    }

  public int indexOf(String word) {
    int indx = -1;
    for (int i = 0; i < data.length; i++) {
      if (this.data[i] == word)
        indx = i;
    }
    return indx;
  }

  public int lastIndexOf(String word) {
    int indx = -1;
    for (int i = data.length - 1; i >= 0; i--) {
      if (this.data[i] == word)
        indx = i;
    }
    return indx;
  }

  public void add(int index, String word) {
    if (this.size == data.length)
      resize();
    for (int i = index; i < this.size - 1; i++) {
      this.data[i + 1] = this.data[i];
    }
    this.data[index] = word;
    size++;
  }

  public String remove(int index) {
    String old = this.data[index];
    if (index < 0 || index > size())
      return null;
    for (int i = index; i < this.size; i++) {
      this.data[i] = this.data[i + 1];
      if (this.data[i + 1] == null)
        data[i] = null;
      }
    size--;
    return old;
  }

  public boolean remove(String word) {
    if (this.contains(word)) {
      this.remove(this.indexOf(word));
      return true;
    }
    return (this.contains(word));
  }


}
