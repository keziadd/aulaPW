package ex_2;

import javax.swing.JOptionPane;
/**
 *
 * @author Lucas Borges
 */
public class Ex_2 {

    static int N1, N2, Resultado;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    public static void Diferença(){
        JOptionPane.showMessageDialog(null, "Iniciando o programa!");
            System.out.println("Iniciando o programa!");
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor insira o segundo valor:"));
        
        JOptionPane.showMessageDialog(null, "Agora veremos a diferença do maior para o menor entre os valores...");
            if (N1 > N2) {
           JOptionPane.showMessageDialog(null, "A diferença entre o valor " +N1+ " e o valor " +N2+ " é de: " +(N1-N2));
            System.out.println("A diferença entre o valor " +N1+ " e o valor " +N2+ " é de: " +(N1-N2));
        }
        
        
        else{
            JOptionPane.showMessageDialog(null, "A diferença entre o valor " +N2+ " e o valor " +N1+ " é de: " +(N2-N1));
                System.out.println("A diferença entre o valor " +N2+ " e o valor " +N1+ " é de: " +(N2-N1));
        }
        JOptionPane.showMessageDialog(null, "Fim do programa.");
            System.out.println("Fim do programa.");
        }  
}
