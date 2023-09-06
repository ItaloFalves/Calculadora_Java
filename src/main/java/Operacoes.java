public class Operacoes {

    int numero1;
    int numero2;

    public Operacoes() {

    }

    public void setValor1(int numero){
        this.numero1 = numero;
    }

    public void setValor2(int numero){
        this.numero2 = numero;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getSummation() {
        return numero1 + numero2;
    }

    public int getSubtraction() {
        return numero1 - numero2;
    }

    public int getMultiplication() {
        return numero1 * numero2;
    }

    public int getDivision() throws ValorException {
        if (numero1 == 0 || numero2 == 0) {
            throw new ValorException("Não é possível fazer divisão por zero");
        } else {
            return numero1 / numero2;
        }
    }
}
