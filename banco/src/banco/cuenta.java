
package banco;

public abstract class cuenta {
    
    private double saldo;

    public cuenta() {
    }

    public cuenta(double saldo) {
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return this.saldo;
    }
    
    
    
    
}
