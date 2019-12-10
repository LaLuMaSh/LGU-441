package com.github.lucaguettinger.scripts.script4;

public class LinkedList<V> {
    Node<V> first;
    Node<V> last;

    public LinkedList() {
        first = new Node<>();
        last = first;
    }

    public int indexOf(V object) {
        Node<V> node = first;
        int i = 0;
        while (node != null) {
            if (node.getObject().equals(object)) {
                return i;
            }
            node = node.getNext();
            i++;
        }
        return -1;
    }

    public boolean add(V object) {
        if (last.getObject() == null) {
            last.setObject(object);
        } else {
            Node<V> element = new Node<>(object, last);
            last.setNext(element);
            last = element;
        }
        return true;
    }

    public boolean remove(V object) {
        assert object != null : "null can not be added to the list";

        if (object.equals(last.getObject())) {
            removeLast();
            return true;
        }

        Node<V> node = first;
        while (node != null) {
            if (node.getObject().equals(object)) {
                if (node.getNext() != null) {
                    node.getNext().setBefore(node.getBefore());
                }
                if (node.getBefore() != null) {
                    node.getBefore().setNext(node.getNext());
                }

                if (node.getNext() == null && node.getBefore() == null) {
                    node.setObject(null);
                }
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public void removeLast() {
        Node<V> l = last.getBefore();
        if (l == null) {
            last.setObject(null);
            return;
        }
        l.setNext(null);
        last = l;
    }
}
