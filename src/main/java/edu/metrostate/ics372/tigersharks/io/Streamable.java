package edu.metrostate.ics372.tigersharks.io;

import java.util.stream.Stream;

/**
 * Created by sleig on 3/16/2017.
 */

@FunctionalInterface
public interface Streamable<T> {
    Stream<T> stream();
}