import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
        
    Jogador j1 = new Jogador();
    Dado d1 = new Dado();
    SistemaAzar s1 = new SistemaAzar();

    System.out.println("Insira sua aposta!");
    d1.setFace(entrada.nextInt());
    
    System.out.println("Insira seu nome!");
    j1.setNome(entrada.next());
    j1.nomeado();

    s1.setJogador(j1);
    s1.setDado(d1);
    d1.sorteado();
    s1.verificarGanhador();
    
    
  }
}
