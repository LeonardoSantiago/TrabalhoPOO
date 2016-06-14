/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author leonardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> p = new ArrayList();
        
        
        
        
        
        // Create
        String nome;
        int quantidade;
        double valor;
        Produto prod;
        System.out.println("Digite o Nome do Produto:");
        nome = sc.nextLine();
        System.out.println("Digite o quantidade do Produto:");
        quantidade = sc.nextInt();
        System.out.println("Digite o valor do Produto:");
        valor = sc.nextDouble();
        prod = new Produto(nome,quantidade,valor);
        p.add(prod);
        
        
        //Read
        System.out.println("Digite o Nome do Produto a ser listado:");
        nome = sc.nextLine();
        for(Produto p1 : p){
            if(nome.equals(p1.getNome())){
               System.out.println("Nome: "+p1.getNome());
               System.out.println("Quantidade: "+p1.getQuantidade());
               System.out.println("Valor: "+p1.getValor());
            }else{
               System.out.println("Nome não encontrado!"); 
            }
            
        }
        
        // Update
        System.out.println("Digite o Nome do Produto a ser atualizado:");
        nome = sc.nextLine();
        for(Produto p1 : p){
            if(nome.equals(p1.getNome())){
                System.out.println("Atualize o Produto");
                System.out.println("Digite o Nome do Produto:");
                p1.setNome(sc.nextLine());
                System.out.println("Digite o quantidade do Produto:");
                p1.setQuantidade(sc.nextInt());
                System.out.println("Digite o valor do Produto:");
                p1.setValor(sc.nextDouble());      
            }else{
               System.out.println("Nome não encontrado!"); 
            }
            
        }
        
        //Remove
        System.out.println("Digite o Nome do Produto a ser removido:");
        nome = sc.nextLine();
        for(Produto p1 : p){
            if(nome.equals(p1.getNome())){
               p.remove(p1);
            }else{
               System.out.println("Nome não encontrado!"); 
            }
            
        }
    }
    
}
