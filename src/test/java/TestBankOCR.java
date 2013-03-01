import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBankOCR {
    @Test
    public void PeutAfficherUnCompteAvecQueDesZero()
    {
        BankOCR uneBankOCR = new BankOCR();
        uneBankOCR.ajouterNumeroDeCompte("\"_  _  _  _  _  _  _  _  _\" +\n" +
                                        "\"| || || || || || || || || |\" +\n" +
                                        "\"|_||_||_||_||_||_||_||_||_|\"");
        assertEquals("000000000", uneBankOCR.convertirNumeroDeCompte());
    }
}
