/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoNullObject;

/**
 *
 * @author USUARIO
 */
class NonNullList extends List {
    private Object head;
    private List tail;

    // Creates a list from a head and tail. Acts as "cons"
    public NonNullList(Object head, List tail) {
        this.head = head;
        this.tail = tail;
    }
    // for convenience we could add a constructor taking only the head to make 1 element lists.
    public Object getHead() {
        return head;
    }

    public List getTail() {
        return tail;
    }

    public Object accept(ListVisitor visitor, Object param) {
        return visitor.whenNonNullList(this, param);
    }
}