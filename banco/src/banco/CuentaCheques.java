
package banco;

public class CuentaCheques extends cuenta implements MovimientosCuenta {
    public double cuota;

    public CuentaCheques(double cuota) {
        this.cuota = cuota;
    }

    public CuentaCheques(double cuota, double saldo) {
        super(saldo);
        this.cuota = cuota;
    }
    
    @Override
    public double retirar(double monto) {
        return monto <= (getSaldo()+ cuota)  ? setSaldo((getSaldo() - monto)) : 0;
    }
    
    @Override
    public double depositar(double monto){
        return (setSaldo(getSaldo()+ monto) - cuota) ;
    }
    

    
}
