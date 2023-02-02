import java.util.Random;

public class Dado{
  private int face;

  Random num = new Random(6);

  public int getFace(){
    return this.face;
  }
  public void setFace(int face){
    this.face= num.nextInt(6);
  }
  public void sorteado(){
    System.out.println("O número soteado foi: "+this.face);
  }
}
