import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws ValorException {

        int valor1 = 0;
        int valor2 = 0;
        int resultado;
        String operacao;
        String calcularNovamente = "S";
        Scanner sc = new Scanner(System.in);

        Operacoes operacoes = new Operacoes();

        while (calcularNovamente.equals("S")) {
            try {
                System.out.println("Digite o primeiro valor: ");
                valor1 = sc.nextInt();
                operacoes.setValor1(valor1);
            } catch (InputMismatchException e) {
                throw new ValorException("Erro: Você não inseriu um valor inteiro.");
            }

            try {
                System.out.println("Digite o segundo valor: ");
                valor2 = sc.nextInt();
                operacoes.setValor2(valor2);
            } catch (InputMismatchException e) {
                throw new ValorException("Erro: Você não inseriu um valor inteiro.");
            }

            System.out.println("Digite a operação desejada: + / - *");
            operacao = sc.next();


            switch (operacao) {
                case "+":
                    resultado = operacoes.getSummation();
                    System.out.println("O resultado da soma do " + operacoes.getNumero1() + " com o " + operacoes.getNumero2() + " é: " + resultado);
                    break;
                case "-":
                    resultado = operacoes.getSubtraction();
                    System.out.println("O resultado da subtração do " + operacoes.getNumero1() + " com o " + operacoes.getNumero2() + " é: " + resultado);
                    break;
                case "*":
                    resultado = operacoes.getMultiplication();
                    System.out.println("O resultado da multiplicação do " + operacoes.getNumero1() + " com o " + operacoes.getNumero2() + " é: " + resultado);
                    break;
                case "/":
                    resultado = operacoes.getDivision();
                    System.out.println("O resultado da divisão do " + operacoes.getNumero1() + " com o " + operacoes.getNumero2() + " é: " + resultado);
                    break;
                default:
                    System.out.println("Operação invalida");
            }
            System.out.println("Deseja calcular novamente?");
            calcularNovamente = sc.next().toUpperCase();
        }
        sc.close();
    }
}

