package task04;

import java.util.Iterator;
import java.util.NoSuchElementException;

import task04.items.Item;

public class BackpackIterator implements Iterator<Item> {
    private final Item[] items;
    private final int itemCount;
    private int currentIndex;

    public BackpackIterator(Item[] items, int itemCount) {
        this.items = items;
        this.itemCount = itemCount;
        this.currentIndex = 0;
        skipWorthless();
    }

    private void skipWorthless() {
        while (currentIndex < itemCount && items[currentIndex].isWorthless())
            currentIndex++;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < itemCount;
    }

    @Override
    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There are no more valuable items");
        }
        Item item = items[currentIndex];
        currentIndex++;
        skipWorthless();
        return item;
    }
}