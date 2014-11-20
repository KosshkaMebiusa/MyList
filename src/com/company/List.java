package com.company;

/**
 * Created by root on 20.11.14.
 */
public interface List<E> {

    public void add(E item);
    public int size();
    public boolean isEmpty();
    public void delete() throws Exception;
    public boolean contains(E key);

}
