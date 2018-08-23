
import com.mycompany.exercicio6.Mediana;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MediaTest {

    public MediaTest() {
    }

    @Test
    public void testeMedianaVetor() {
        double[] numeros = {1, 2, 3, 4, 5};
        Mediana m = new Mediana();
        double res = m.getMediana(numeros);
        assertEquals(3, res, 0.1);
    }
    @Test (expected = Exception.class)
    public void testeNulo() {
        double[] numeros = null;
        Mediana m = new Mediana();
        double res = m.getMediana(numeros);
        
    }
}
