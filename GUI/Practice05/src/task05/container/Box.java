package task05.container;

public class Box<T> {
    private T content;

    public Box() {
        content = null;
    }

    public Box(T content) {
        this.content = content;
    }

    public void put(T item) {
        if (content != null) {
            throw new IllegalStateException("Content of the container is not empty");
        }
        this.content = item;
    }

    public T get() {
        if (content == null) {
            throw new IllegalStateException("Content of the container is empty");
        }
        return content;
    }

    public T getAndClear() {
        T item = get();
        clear();
        return item;
    }

    public boolean isEmpty() {
        return content == null;
    }

    public void clear() {
        content = null;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "Box{EMPTY}";
        return "Box{" + content.toString() + "}";
    }
}