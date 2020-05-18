//Desenvolvido em 2018
//Jogo de Números: o usuario tem que acertar o número que o programa escolher.

import java.util.Random; //Biblioteca Rondomica
import java.util.Scanner; //Biblioteca para entrada de dado


public class Jogo_dos_Numeros {

    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in); //Declaração de entrada de dados (Int)
     Random rand= new Random(); //Declaração do Rondomico
     int R, N, cont, Rd=1; 
     String nome, resp="5";
     do{ R= rand.nextInt(10); //(linha 15 e 16) Gerar numero automatico de 0 a 10
        cont=1;
       System.out.print("Digite o Nome do Jogador: "); //(linha 17 e 18)Entrada do nome do Jogador
       nome = sc.next();
     
       do{    //(linha 20 a 23) Primeira tentativa do jogador
         System.out.println("Jogador: "+nome); //Exibição
         System.out.print(cont+"ª Tentativa \n Digite um Número: "); //Exibição(print)
         N = sc.nextInt(); //Entrada de dados (int)
         
         if(R==N)  //(linha 25 a 28) Comparação do Numero rondomico com o numero do usuário
           System.out.println("Você Acertou!"); //Acertou: Rondomico = usuário
         else if(N>R) System.out.println("O Número desejado é menor que "+N); //Errou: Se o é número menor
              else System.out.println("O Número desejado é maior que "+N); //Errou: Se o número é maior
              
         if(cont<Rd) //Recorde dos Jogadores(usuários do jogo)
            Rd = cont; //Recorde é o número de tentativas (Quanto menor o número melhor o resultado)
           System.out.println("PONTOS: "+Rd); //Exibição
        cont++; // Fim da Partida
        }while(R!=N);  //(linha 34 a 38) A liberdade do usuário por optar por outra partida do Jogo
        System.out.println("\n Deseja jogar novamente? S/N "); //Exibição da pergunta
        resp = sc.next().toUpperCase(); //Entrada de dados (resposta do usuário)
        
     }while (resp.equals("S")); //Começar outra partida caso a resposta seja Sim(S)
    }
    
}
