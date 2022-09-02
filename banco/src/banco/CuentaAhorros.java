/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author S 102- 14
 */
public  class CuentaAhorros extends cuenta implements MovimientosCuenta {
    
    public double tasaInteres;

    public CuentaAhorros(double saldo, double tasaInteres ) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public double calcularIntereses(){
        return ((this.tasaInteres /100) * getSaldo());
    }
    
    @Override
    public double retirar(double monto) {
        double ret = getSaldo() - monto;
        return monto <= getSaldo() ? setSaldo(ret) : 0;
    }
    @Override
    public double depositar(double monto){
        return setSaldo(getSaldo() + monto);
    }
    
    
}
