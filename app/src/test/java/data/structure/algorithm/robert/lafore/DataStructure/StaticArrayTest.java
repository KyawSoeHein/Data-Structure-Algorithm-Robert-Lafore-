package data.structure.algorithm.robert.lafore.DataStructure;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import data.structure.algorithm.DataStructure.StaticArray;
import org.junit.jupiter.api.Test;

public class StaticArrayTest {

  @Test
  public void test_insert() {
    StaticArray arr = new StaticArray(5);
    int[] actual = arr.insert(1);
    assertEquals(1, actual[0]);
    assertEquals(arr.count, 1);
  }

  @Test
  public void test_delete_by_index() {
    StaticArray arr = new StaticArray(5);
    arr.insert(1);
    arr.insert(2);
    arr.insert(3);
    arr.insert(4);

    int[] actual = arr.deleteByIndex(1);
    int[] expected = { 1, 3, 4, 0, 0 };

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test_move_item_to_higher_one_place() {
    StaticArray arr = new StaticArray(5);
    arr.insert(1);
    arr.insert(2);
    arr.insert(3);
    arr.insert(4);

    int[] actual = arr.moveItemsToHigherOnePlace(1);
    int[] expected = { 1, 3, 4, 0, 0 };

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test_search() {
    StaticArray arr = new StaticArray(5);

    //Empty array will return false
    assertEquals(arr.search(5), false);
    arr.insert(1);
    arr.insert(2);
    arr.insert(3);
    arr.insert(4);

    //found the value
    assertEquals(true, arr.search(4));
    //didn't find value
    assertEquals(false, arr.search(5));
  }

  @Test
  public void test_delete_by_value() {
    StaticArray arr = new StaticArray(5);
    arr.insert(1);
    arr.insert(2);
    arr.insert(3);
    arr.insert(4);

    int[] actual = arr.deleteByValue(3);
    int[] expected = { 1, 2, 4, 0, 0 };

    assertArrayEquals(expected, actual);
  }
}
