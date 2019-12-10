package com.github.lucaguettinger.scripts.script4;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter(AccessLevel.PACKAGE)
@Getter
public class Node<V> {
    private V object;
    private Node<V> next;
    private Node<V> before;

    public Node(V object, Node<V> next, Node<V> before) {
        this.object = object;
        this.next = next;
        this.before = before;
    }

    public Node(V object, Node<V> before) {
        this(object, null, before);
    }

    public Node() {
        this(null, null, null);
    }
}
