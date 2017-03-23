package edu.metrostate.ics372.tigersharks.io;

import edu.metrostate.ics372.tigersharks.LibraryItem;
import edu.metrostate.ics372.tigersharks.io.database.Database;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *Responsible for storing data
 *
 *@author tigersharks <a href="https://github.com/yd8266uj/tigersharks">github</a>
 * @version 1

 */
public class Store<T> implements Consumer<T>, Streamable<T> {
    
    /**
    * declares database
    */
    private Database<T> database;
    /*
    *determines which database to store it in
    */
    public Store(Database<T> database) {
        this.database = database;
    }
    /**
    * 
    *Takes the library Item and adds it into the Database.
    *
    *@param generic LibraryItem
    */
    @Override
    public void accept(T libraryItem) {
        database.update(libraryItem);
    }
    
    /*
    *Selects all stream from database.
    */
    public Stream<T> stream() {
        return database.selectAll().stream();
    }
}
