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
interface ListVisitor {
    Object whenNonNullList(NonNullList host, Object param);
    Object whenNullList(NullList host, Object param);
}