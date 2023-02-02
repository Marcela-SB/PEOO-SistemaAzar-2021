import java.util.Random;

public class SistemaAzar{
  Jogador jogador;
  Dado dado;

  public Jogador getJogador(){
    return this.jogador;
  }
  public void setJogador(Jogador jogador){
    this.jogador=jogador;
  }
  public Dado getDado(){
    return this.dado;
  }
  public void setDado(Dado dado){
    this.dado=dado;
  }
  public void verificarGanhador(){
    if(jogador.getAposta() == dado.getFace()){
      System.out.println("Parabéns!");
    }
    else{
      System.out.println("Melhor na próxima!");
    }
  }
}
