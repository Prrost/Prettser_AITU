package assignment3.iterator;


public class ListMovieIterator<T> implements MyIterator<T> {
    private ListMovieCollection<T> collection;
    private int index;

    public ListMovieIterator(ListMovieCollection<T> collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return index < collection.linkedList.size();
    }

    public T next() {
        if (hasNext()) {
            return collection.linkedList.get(index++);  // Возвращаем элемент и увеличиваем позицию
        }
        return null;
    }
}
