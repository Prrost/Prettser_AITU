package assignment3.iterator;

public class ArrayMovieIterator<T> implements MyIterator<T>{
    private ArrayMovieCollection<T> arrayMovieCollection;
    private int index = 0;

    public ArrayMovieIterator(ArrayMovieCollection<T> arrayMovieCollection) {
        this.arrayMovieCollection = arrayMovieCollection;
    }

    public boolean hasNext() {
        return index < arrayMovieCollection.arrayList.size();
    }

    public T next(){
        if (hasNext()) {
            return arrayMovieCollection.arrayList.get(index++);  // Возвращаем элемент и увеличиваем позицию
        }
        return null;
    }
}
