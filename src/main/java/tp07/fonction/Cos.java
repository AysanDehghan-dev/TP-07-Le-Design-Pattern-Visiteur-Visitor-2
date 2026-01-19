package tp07.fonction;

public class Cos implements Fonction{

    @Override
    public String getNom() {
      return "cos";
    }

    @Override
    public double evaluer(double x) {
        return Math.cos(x);
    }
    
}
