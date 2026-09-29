package task04;

import java.util.Comparator;
import task04.items.Item;

public class ItemNameComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}