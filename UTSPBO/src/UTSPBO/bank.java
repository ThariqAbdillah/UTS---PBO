/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

/**
 *
 * @author usert
 */
public class bank {
    public int saldo = 10000;
    void Ambiluang(int sld){
        
       if(saldo >= sld){
        saldo=saldo-sld;
        System.out.println("saldo saat ini : Rp." + saldo);
        }else{
     System.out.println("Saldo saat ini tidak Mencukupi");
    }
    }
    void simpanUang(int sld){
        saldo=saldo+sld;
    }
    void getsaldo(){
        System.out.println("saldo saat ini: Rp " + saldo);
    }
}
    

