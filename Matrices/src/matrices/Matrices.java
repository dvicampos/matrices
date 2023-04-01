package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println("Matriz ["+i+"] ["+j+"]:");
                matriz [i][j] = entrada.nextInt();
            }
        }
        System.out.println("La Matriz es: ");
        for(int i=0;i<nFilas;i++){
            for(int j=0; j<nCol; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
