import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraCientifica extends Calculadora {
    
    public CalculadoraCientifica(){
    modelo = "Calos";
    JOptionPane.showMessageDialog(null, "Calculadora Científica " + modelo);
    }
    
    public void mensagem(){
        JOptionPane.showMessageDialog(null, "modelo dessa calculadora é " + modelo);
    }

    public static void subtracao(){

    }

    @Override
    public double subtracao(double a, double b){
        double resultado = a -b;
        return resultado;
    }
}
