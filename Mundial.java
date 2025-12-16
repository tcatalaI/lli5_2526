public class Mundial {

private static    String[] paisosClassificats = {
            "USA","CAN","MEX","JPN","IRN","KOR","AUS","JOR","QAT","KSA","UZB","ALG","CPV","EGY","GHA","CIV","MAR","SEN","RSA","TUN","ENG","NZL","ARG","BRA","COL","ECU","PAR","URU"
    };


    public static boolean participaAlMundial2026(String codiPais) {

        for (String pais : paisosClassificats) {
            if (pais.equalsIgnoreCase(codiPais)) {
                return true;
            }
        }
        return false;
    }

    public static short nombrePaisosClassificats() {
        // Retorna el nombre de paisos classificats
        return (short) paisosClassificats.length;
    }

    public static String getPais (short pais) {
        // Donat un index de pais retorna la codificació
        return paisosClassificats[pais];
    }

}