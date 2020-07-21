package com.sf.effectivejava.item17;

import java.util.List;

/**         TODO make it immutable
 *         -No Setters
 *         -Final Class
 *         -All field final
 *         -All field private
 *         -No Getter for mutable component
 *         -Return immutable collection for Collection component
 */
public class ImmutableExample {

    private MutableDependent dependent;
    private int x;
    private List<Object> objectList ;
}
