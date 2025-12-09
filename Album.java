public class Album {
    private Cromo[] album;
    private int cromosAferrats = 0;

    public int getCromosAferrats() {
        return cromosAferrats;
    }


    public Album() {
        album = new Cromo[864]; // Inicialitza l'array amb 864 elements
    }

    public Cromo getCromo(int index) {
        if (index < 0 || index >= 864) {
            throw new IndexOutOfBoundsException("Index fora de rang: " + index);
        }
        return album[index];
    }

    public void setCromo(int index, Cromo cromo) {
        if (index < 0 || index >= 864) {
            throw new IndexOutOfBoundsException("Index fora de rang: " + index);
        }
        album[index] = cromo;
    }

    public boolean isFull() {
        for (Cromo cromo : album) {
            if (cromo == null) {
                return false;
            }
        }
        return true;
    }
    private boolean aferrarCromo(Cromo cromo) {
        int posicio = cromo.getNumero() - 1; // Calculate the position
        if (album[posicio] == null) {
            album[posicio] = cromo;
            cromosAferrats++;
            return true;

        }
        else {

            return false; // Position already occupied

        }
    }

    public void aferrarPaquet(Paquet paquet) {
        int nombreCromos = paquet.getCromos().size();
        int apuntador = 0;
        for (int i = 0; i < nombreCromos; i++) {
            Cromo cromo = paquet.getCromos().get(apuntador);
            if (aferrarCromo(cromo)) {
                paquet.getCromos().remove(apuntador); // Remove the cromo from the paquet
            } else { apuntador++;
            }

        }
    }


    public static void main(String args[]) {

        Paquet P1 = new Paquet();
        System.out.println(P1.getCromos().size());
        Album A1 = new Album();
        Album A2 = new Album();
        A1.aferrarPaquet(P1);

        System.out.println(P1.getCromos().size());
        A2.aferrarPaquet(P1);
        System.out.println("cromos aferrats:");
        System.out.println(A1.getCromosAferrats());
        System.out.println(A2.getCromosAferrats());



    }
}

