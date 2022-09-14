//https://www.codewars.com/kata/515bb423de843ea99400000a

package codewars.level5;

import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<I> {

    List<I> collection;
    int itemsPerPage;

    // The constructor takes in array of items and integer indicating how many items fit within a single page
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    // returns the number of items within the entire collection
    public int itemCount() {
        return collection.size();
    }

    // returns the number of pages
    public int pageCount() {
        return (int)Math.ceil((double)itemCount()/itemsPerPage);
    }

    // returns the number of items on the current page; should return -1 for values out of range
    public int pageItemCount(int pageIndex) {
        List<List<Object>> book1 = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < pageCount(); i++) {
            book1.add(new ArrayList<>());
            while (index < itemsPerPage*((i == 0) ? 1 : i+1) && index < itemCount()) {
                book1.get(i).add(collection.get(index));
                index++;
            }
        }
        try {
            return book1.get(pageIndex).size();
        } catch (IndexOutOfBoundsException e) {
            return -1;
        }
    }

    // determines what page an item is on; should return -1 for values out of range
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > itemCount()-1) {
            return -1;
        }
        List<List<Object>> book2 = new ArrayList<>();
        int index = 0;
        int result = 0;
        for (int i = 0; i < pageCount(); i++) {
            book2.add(new ArrayList<>());
            while (index < itemsPerPage*((i == 0) ? 1 : i+1) && index < itemCount()) {
                book2.get(i).add(collection.get(index));
                if (index == itemIndex) {
                    result = i;
                }
                index++;
            }
        }
        return result;
    }
}

