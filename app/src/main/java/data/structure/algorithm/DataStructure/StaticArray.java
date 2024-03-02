package data.structure.algorithm.DataStructure;

public class StaticArray {

  public int count;
  int[] arr;

  public StaticArray(int size) {
    this.arr = new int[size];
    this.count = 0;
  }

  public int[] insert(int value) {
    arr[count] = value;
    count++;
    return arr;
  }

  public int[] deleteByIndex(int index) {
    arr[index] = 0;
    moveItemsToHigherOnePlace(index);
    return arr;
  }

  public int[] deleteByValue(int value) {
    for (int i = 0; i < count + 1; i++) {
      if (arr[i] == value) {
        moveItemsToHigherOnePlace(i);
      }
    }

    return arr;
  }

  public int[] moveItemsToHigherOnePlace(int index) {
    if (count == 0 || index == arr.length - 1) {
      return arr;
    }

    for (int i = index + 1; i < count + 1; i++) {
      arr[i - 1] = arr[i];
    }

    return arr;
  }

  public boolean search(int value) {
    if (count == 0) {
      return false;
    }

    for (int i = 0; i < count + 1; i++) {
      if (arr[i] == value) {
        return true;
      }
    }

    return false;
  }
}
