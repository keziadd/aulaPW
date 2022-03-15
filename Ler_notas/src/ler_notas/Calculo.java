package ler_notas;

import javax.swing.JOptionPane;
/**
 *
 * @author Lucas Borges 2°DS
 */
public class Calculo {
    
    static String Nome;
    static double NT1;
    static double NT2;
    static double MD;
    
    static void LerNotas(){
      
        JOptionPane.showMessageDialog(null, "Iniciando o programa!");
        Nome = JOptionPane.showInputDialog(null, "Olá aluno(a), por favor insira seu nome:");
        NT1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Agora por favor insira sua primeira nota:"));
        NT2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Agora por favor insira sua segunda nota:"));
    }
    
    static void CalcNotas(){
        MD = (NT1 + NT2)/2;
        
        if(MD >=7 && MD<=10) {
            JOptionPane.showMessageDialog(null,  Nome+ " Sua nota é: " +MD+ " parabéns você foi aprovado");
                System.out.println(Nome+ " Sua nota é: " +MD+ " parabéns você foi aprovado ");
            JOptionPane.showMessageDialog(null, "Programa encerrado");
                System.out.println("Programa encerrado");
        }
        else if (MD >= 0 && MD <6) {
            JOptionPane.showMessageDialog(null, Nome+  " Sua nota é: " +MD+ " Você não foi aprovado, deve estudar mais!");
                    System.out.println(Nome+ " Sua nota é: " +MD+ " parabéns você foi aprovado ");
            JOptionPane.showMessageDialog(null, "Programa encerrado");
                    System.out.println("Programa encerrado!");
        }
    }
}