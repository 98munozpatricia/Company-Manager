import java.util.HashSet;
import java.util.Set;

public class Empresa {
    String nom;
    int numerotreballadors;
    Set<Treballador> treballadors = new HashSet<Treballador>();
    public Empresa(String nom, int numero)
    {
        this.nom=nom;
        this.numerotreballadors=numero;
    }



}
