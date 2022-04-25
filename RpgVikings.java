
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author danilo.maximiano
 */
public class RpgVikings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Importação e Variaveis: 
        
        Scanner input = new Scanner(System.in);
        String playUm;
        int X, decisao01, decisaoClasse;
        double Y;
        
        //Inicio do Jogo:
        
        System.out.println("Descrição do jogo .... \n nosso jogo... \n no ano de 1066 \n os vikings....");
        System.out.println("Digite o nome de seu personagem: ");
        playUm = input.nextLine();
        System.out.println("Voce deseja que seu nome seja " + playUm +"?");
        System.out.println("[Digite (1)-SIM ou (2)-NÃO]");
        decisao01 = input.nextInt();
        
        //Primeira Decisao Nome do jogador!
        
        if(decisao01==1){
               System.out.println("Saudaçoes VIKINGS, " + playUm + " SKOOLLL!");
        }else{ System.out.println("Digite o nome desejado: ");
               playUm=input.next();
               System.out.println("Decidido isso, " + playUm + " vamos la jogar!!!");}
        
        //Continuação e Segunda Decisao Classe de guerreiro!
        
        System.out.println("Historia...\n Escolhar a sua classe de guerreiro:\n [ (1)Guerreiro - (2) Curandeiro - (3)Arqueiro - (4)Paladino ] ");
        decisaoClasse = input.nextInt();
        switch(decisaoClasse){
            case 1:
                System.out.println(playUm + ", da classe dos Guerreiro com habilidades....");
                break;
            case 2:
                System.out.println(playUm + ", da classe dos Curandeiros com habilidades em ....");
                break;
            case 3:
                System.out.println(playUm + ", da classe dos Arqueiros com habilidades em.... ");
                break;
            case 4:
                System.out.println(playUm + ", da classe dos Paladinos com habilidade em...");
                break; }
                
        System.out.println(" Continuação da historio apos a escolha da classe....\n e mais das historio ate a charada \n oque o salvou mas poderia o ter matado..? ");
        
            
        }
        
        
              
    }
    
}
