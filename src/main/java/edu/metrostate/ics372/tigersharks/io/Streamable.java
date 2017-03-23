package edu.metrostate.ics372.tigersharks.io;

import java.util.stream.Stream;

/**
 *Creates the interface from Streamable
 *
 *@author tigersharks <a href="https://github.com/yd8266uj/tigersharks">github</a>
 * @version 1

 */

@FunctionalInterface
public interface Streamable<T> {
    Stream<T> stream();
}
