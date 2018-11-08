public class SuperArray {


  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public SuperArray(int startingCapacity) {
    if (startingCapacity < 0)
      throw new IllegalArgumentException(startingCapacity + "is an invalid size");
    data = new String[startingCapacity];
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
    if (data.length == size)
      resize();
    data[size] = word;
    size++;
    return true;
  }

  public String toString() {
    String a = "[";
    for(int i = 0; i < size; i++) {
      a += data[i];
      if (i != size - 1)
        a += ", ";
      }
      return a += "]";
    }

  public String toStringDebug() {
    String a = "[";
    for(int i = 0; i < data.length - 1; i++) {
      a += data[i];
      if (i != size - 1)
        a += ", ";
      }
      return a += "]";
    }

  public String get(int index) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException(index + "is an invalid index");
    else return data[index];
  }

  public String set(int index, String word) {
    String old = "";
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException(index + "is an invalid index");
    else data[index] = word;
    return old;
    }

    private void resize() {
      String[] copy = new String[size * 2 + 1];
      for (int i = 0; i < size; i++) {
        copy[i] = data[i];
      }
      data = copy;
    }

    public boolean contains(String word) {
      for (int i = 0; i < size; i++) {
        if (data[i].equals(word))
          return true;
      }
      return false;
    }

  public int indexOf(String word) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(word))
        return i;
    }
    return -1;
  }

  public int lastIndexOf(String word) {
    for (int i = size - 1; i > 0; i--) {
      if (data[i].equals(word))
        return i;
    }
    return -1;
  }

  public void add(int index, String word) {
    if (index < 0 || index > size()) {
    throw new IndexOutOfBoundsException();
  }
    else {
      if (data.length == size) {
      resize();
    }
      String[] result = new String[data.length];
      for (int i = 0; i < size; i++) {
        result[i] = data[i];
      }
      for (int i = index; i < size; i++) {
        result[i + 1] = data[i];
      }
      result[index] = word;
      size++;
      data = result;
    }
  }

  public String remove(int index) {
    String removed = data[index];
    if (index < 0 || index > size())
    {
      throw new IndexOutOfBoundsException();
  }
      String[] result = new String[data.length];
      for (int i = 0; i < size(); i++) {
        result[i] = data[i];
      }
      for (int i = index; i < size() - 1; i++) {
        result[i] = result[i + 1];
      }
      size--;
      data = result;
    return removed;
  }

  public boolean remove(String word) {
    if (contains(word)) {
      remove(indexOf(word));
      return true;
    }
    return (contains(word));
  }


}
