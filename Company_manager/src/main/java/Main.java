import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Empresa> empresa = new HashSet<Empresa>();
        empresa.add(new Empresa("Apple", 50));

        for(Empresa  e:empresa)
            System.out.println(e.nom+ " tiene "+e.numerotreballadors + " trabajadores.");
    }
}
