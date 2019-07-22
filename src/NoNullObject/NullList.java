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
class NullList extends List {
    private static final NullList instance = new NullList();
    
    private NullList() {}

    public static NullList singleton() {
        return instance;
    }

    public List getTail() {
        return this;
    }

    public Object accept(ListVisitor visitor, Object param) {
        return visitor.whenNullList(this, param);
    }
}