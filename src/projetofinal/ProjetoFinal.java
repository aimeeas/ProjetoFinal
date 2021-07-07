/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.Scanner;

/**
 *
 * @author Aimee
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da conta: ");
        double valorConta = scan.nextDouble();
        
        System.out.println("Insira valor da gorjeta deseja: ");
        double percentualGorjeta = scan.nextDouble();
        
        double valorFinal;
        valorFinal = (valorConta + (valorConta*percentualGorjeta/100));
        System.out.println("O valor total da conta é: " + valorFinal);
    }
    
}
