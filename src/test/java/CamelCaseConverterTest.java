import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CamelCaseConverterTest {

    private static CamelCaseConverter camelCase;

    @BeforeAll
    static void setup() {
        camelCase = new CamelCaseConverter();
    }

    @Test
    public void retornarCamelCaseNomeSimples() {
        assertEquals("Alexandre Sa", camelCase.converter("alexandre SA"));
    }

    @Test
    public void retorarNomeSimplesMisturadoMaiusculoEMinusculo() {
        assertEquals("Lionel", camelCase.converter("liONel"));
    }

    @Test
    public void retornarTresOuMaisNomesCompostosCamelCase() {
        assertEquals("Alexandre Pereira Da Rocha", camelCase.converter("alexandre PereIRA DA ROCHA"));
    }
}
