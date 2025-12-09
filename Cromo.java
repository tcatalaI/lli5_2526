import java.time.LocalDate;

public class Cromo {
    private  short numero;
    private static int cromosNoMundial = 0;
    private final String pais;
    private  int anyIncorporacio;
    private  double alcada; // in meters
    private  double pes; // in kilograms
    private  String posicio; // davanter, mig, defensa, porter
    private  String nom;
    private  LocalDate dataNaixement;


    public short getNumero() {
        return numero;
    }


    // Constructor
    public Cromo(String pais, int anyIncorporacio, double alcada, double pes, String posicio, String nom, LocalDate dataNaixement) {

        this.anyIncorporacio = anyIncorporacio;
        this.alcada = alcada;
        this.pes = pes;
        this.posicio = posicio;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
        this.pais = pais;
        this.numero = 0;
    }

    public Cromo(short numero, String pais) {

        this.numero = numero;
        this.pais = pais;
    }

        // Getters

    public String getPais() {
        return pais;
    }

    public int getAnyIncorporacio() {
        return anyIncorporacio;
    }

    public double getAlcada() {
        return alcada;
    }

    public double getPes() {
        return pes;
    }

    public String getPosicio() {
        return posicio;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }
public static int getCromosNoMundial() {
    return cromosNoMundial;
}
    // toString method
    @Override
    public String toString() {
        return "Cromo{" +
                "pais='" + pais + '\'' +
                ", anyIncorporacio=" + anyIncorporacio +
                ", alcada=" + alcada +
                ", pes=" + pes +
                ", posicio='" + posicio + '\'' +
                ", nom='" + nom + '\'' +
                ", dataNaixement=" + dataNaixement +
                '}';
    }

    public static void main(String args[]) {
        Cromo c1, c2, c3, c4, c5;
        c1 = new Cromo ("esp", 2025, 1.76, 67,"P", "Pichford", LocalDate.of(2023, 12, 25));
        c2 = new Cromo ("ITL", 2025, 1.76, 67,"D", "Mbappe", LocalDate.of(2023, 12, 25));
        c3 = new Cromo ("USA", 2025, 1.76, 67,"M", "xxxx", LocalDate.of(2023, 12, 25));
        c4 = new Cromo ("MEX", 2025, 1.76, 67,"M", "M", LocalDate.of(2023, 12, 25));
        c5 = new Cromo ("CAN", 2025, 1.76, 67,"p", "M", LocalDate.of(2023, 12, 25));
        System.out.println("No classificats " + Cromo.getCromosNoMundial());
    }
}