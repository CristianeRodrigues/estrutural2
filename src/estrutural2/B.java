/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutural2;

/**
 *
 * @author Cristiane
 */
public class B {
    int codigoB;
    String nomeB;
    A ClassA;
    
    public int getCodigoB(){
        String nomeAux = ClassA.getNomeA();
        return this.codigoB;
    }
    
    public void add_nome(){
        ClassA.setCodigoA(codigoB);
    }
    
    public void setCodigoB(int codigoB){
        this.codigoB = codigoB;
        ClassA.setCodigoA(codigoB);
        ClassA.setCodigoA(100);
        ClassA.codigoA = 30;
    } 
}
