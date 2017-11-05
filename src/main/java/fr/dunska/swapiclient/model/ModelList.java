package fr.dunska.swapiclient.model;

import java.io.Serializable;
import java.util.List;

public class ModelList<T> implements Serializable {

    public int count;
    public String next;
    public String previous;
    public List<T> results;

    public boolean hasMore() {
        return (next != null && next.length() != 0);
    }
}
