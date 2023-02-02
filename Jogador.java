public class Jogador{
  private String nome;
  private int aposta;

  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome=nome;
  }
  public int getAposta(){
    return this.aposta;
  }
  public void setAposta(int aposta){
    this.aposta=aposta;
  }
  public void nomeado(){
    System.out.println("Nome do jogador: "+getNome());
  }
}
