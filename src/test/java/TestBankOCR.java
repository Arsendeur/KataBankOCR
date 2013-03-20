import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBankOCR {
    @Test
    public void PeutAfficherUnCompteAvecQueDesZero()
    {
        BankOCR uneBankOCR = new BankOCR();
        uneBankOCR.ajouterNumeroDeCompte(" _  _  _  _  _  _  _  _  _ \n" +
                                         "| || || || || || || || || |\n" +
                                         "|_||_||_||_||_||_||_||_||_|");
        assertEquals("000000000", uneBankOCR.convertirNumeroDeCompte());
    }

    @Test
    public void PeutAfficherUnCompteAvecQueDesUn()
    {
        BankOCR uneBankOCR = new BankOCR();
        uneBankOCR.ajouterNumeroDeCompte("                           \n" +
                                         "  |  |  |  |  |  |  |  |  |\n" +
                                         "  |  |  |  |  |  |  |  |  |");
        assertEquals("111111111", uneBankOCR.convertirNumeroDeCompte());
    }

    @Test
    public void PeutAfficherUnCompteAvecTousLesChiffres()
    {
        BankOCR uneBankOCR = new BankOCR();
        uneBankOCR.ajouterNumeroDeCompte("    _  _     _  _  _  _  _ \n" +
                                         "  | _| _||_||_ |_   ||_||_|\n" +
                                         "  ||_  _|  | _||_|  ||_| _|");
        assertEquals("123456789", uneBankOCR.convertirNumeroDeCompte());
    }
}