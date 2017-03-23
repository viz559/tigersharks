package edu.metrostate.ics372.tigersharks.io.database;

import java.util.List;

/**
 *Creates interface for database class.
 *
 * @author tigersharks <a href="https://github.com/yd8266uj/tigersharks">github</a>
 */
public interface Database<T> {
    List<T> selectAll();
    void update(T t);
}
