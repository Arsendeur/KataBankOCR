import java.util.HashMap;

public class BankOCR {
    private String numeroDeCompteEnChaineDeCaractere;
    private HashMap<String, Integer> groupeDesNombresOCR = new HashMap<String, Integer>();

    public BankOCR()
    {
        groupeDesNombresOCR.put(" _ " +
                                "| |" +
                                "|_|",0);

        groupeDesNombresOCR.put("   " +
                                "  |" +
                                "  |",1);

        groupeDesNombresOCR.put(" _ " +
                                " _|" +
                                "|_ ",2);

        groupeDesNombresOCR.put(" _ " +
                                " _|" +
                                " _|",3);

        groupeDesNombresOCR.put("   " +
                                "|_|" +
                                "  |",4);

        groupeDesNombresOCR.put(" _ " +
                                "|_ " +
                                " _|",5);

        groupeDesNombresOCR.put(" _ " +
                                "|_ " +
                                "|_|",6);

        groupeDesNombresOCR.put(" _ " +
                                "  |" +
                                "  |",7);

        groupeDesNombresOCR.put(" _ " +
                                "|_|" +
                                "|_|",8);

        groupeDesNombresOCR.put(" _ " +
                                "|_|" +
                                " _|",9);

    }

    public String convertirNumeroDeCompte() {
        String numeroDeCompteEnChiffre = "";
        for (int indexChiffreAConvertir = 0; indexChiffreAConvertir < 9*3; indexChiffreAConvertir += 3)
            numeroDeCompteEnChiffre += convertirUnChiffreOCRenChiffreArabe(indexChiffreAConvertir);

        return numeroDeCompteEnChiffre;
    }

    private int convertirUnChiffreOCRenChiffreArabe(int indexChiffreAConvertir) {
        String[] numeroDeCompteDecoupe;
        String chiffreEnOCR = "";
        numeroDeCompteDecoupe = numeroDeCompteEnChaineDeCaractere.split("\n");

        for(int i = 0; i<3; i++)
        {
            chiffreEnOCR +=  numeroDeCompteDecoupe[i].substring(indexChiffreAConvertir, indexChiffreAConvertir+3);
        }

        return groupeDesNombresOCR.get(chiffreEnOCR);
    }

    public void ajouterNumeroDeCompte(String numeroDeCompteEnChaineDeCaractere) {
        this.numeroDeCompteEnChaineDeCaractere = numeroDeCompteEnChaineDeCaractere;
    }

}
