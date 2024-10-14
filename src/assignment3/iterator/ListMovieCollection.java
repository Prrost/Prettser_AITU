package assignment3.iterator;

import java.util.LinkedList;

public class ListMovieCollection<T> {
    public LinkedList<T> linkedList = new LinkedList<>();


    public void addMovie(T movie) {
        linkedList.add(movie);
    }
}
