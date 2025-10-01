import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("1-Soma(2 números)\n2-Soma(3 números)\n3-Subtração\n4-Multiplicação\n5-Divisão"));

        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o primeiro operando?"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o segundo operando?"));

        double resultado;

        if(op == 1){
            resultado = calc.soma(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
        }
        else if (op == 2){
            double operando3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o terceiro operando?"));
            resultado = calc.soma(operando1, operando2, operando3);
            JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado);
        }
        else if (op == 2){
            resultado = calc.subtracao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado);
        }
        else if (op == 3){
            resultado = calc.multiplicao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da mu ltiplicação é: " + resultado);
        }
        else if (op == 4){
            resultado = calc.divisao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
        }
        else{
            JOptionPane.showMessageDialog(null,  "Opção inválida");
        }
    }
}
