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
public class A {
    long codigoA;
    String nomeA;
    
    public void setNomeA(String nomeA){
        this.nomeA = nomeA;
    }
    public String getNomeA(){
        return this.nomeA;
    }
    
    public int getCodigoA(){
        System.out.println("codigo A");
        return this.codigoA;
    }
    
    public void setCodigoA(int codigoA){
        this.codigoA = codigoA;
        System.out.println("codigo A");
    }
}
