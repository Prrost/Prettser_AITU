package assignment3.iterator;

import java.util.ArrayList;

public class ArrayMovieCollection<T> {
    public ArrayList<T> arrayList = new ArrayList<>();


    public void addMovie(T movie){
        arrayList.add(movie);
    }
}
