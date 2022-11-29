package codewars.kyu5;

import java.util.ArrayList;
import java.util.List;

//5 kyu
//PaginationHelper
//https://www.codewars.com/kata/515bb423de843ea99400000a
public class PaginationHelper<I> {

    List<I> itemList;
    int itemsPerPage;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        itemList = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return itemList.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) itemList.size() / itemsPerPage);
//        return itemList.size() / itemsPerPage;/
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        return pageIndex > pageCount()   ? -1 :
                pageCount() == pageIndex ? (itemList.size() - itemsPerPage * (pageIndex - 1)) : itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        int res =  (int) Math.ceil((double) itemIndex / itemsPerPage);
        return (pageCount() >= res && res > 0) ? res : -1;
    }
}
