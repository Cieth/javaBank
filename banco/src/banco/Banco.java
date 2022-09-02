
package banco;

import java.util.Scanner;


public class Banco {
    
    public static void main(String[] args) {
    
        CuentaAhorros c = new CuentaAhorros(100000,7);
        System.out.println(c.getSaldo());

        c.retirar(10000);
        c.retirar(10000);
        c.retirar(10000);
        c.depositar(5000);
        c.retirar(75001);
        System.out.println(c.getSaldo());
        
        
        CuentaCheques d = new CuentaCheques(100000,7);
        System.out.println(d.getSaldo());
    }
        
}
    

