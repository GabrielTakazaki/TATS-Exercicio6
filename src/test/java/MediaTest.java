
import com.mycompany.exercicio6.Mediana;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MediaTest {

    Mediana m = new Mediana();

    @Test
    public void testeMedianaVetor() throws Exception {
        double[] numeros = {1, 2, 3, 4, 5};
        double res = m.getMediana(numeros);
        assertEquals(3, res, 0.1);
    }

    @Test
    public void testeMedianaDesordenado() throws Exception {
        double[] numeros = {5, 3, 2, 4, 1};
        double res = m.getMediana(numeros);
        assertEquals(3, res, 0.1);
    }

    @Test
    public void testeMedianaPar() throws Exception {
        double[] numeros = {1, 4, 6, 2, 7, 3};
        double res = m.getMediana(numeros);
        assertEquals(3.5, res, 0.1);
    }

    @Test
    public void testeMedia() throws Exception {
        double[] numeros = {1};
        double res = m.getMedia(numeros);
        assertEquals(1, res, 0.1);
    }

    @Test
    public void testeMenorValor() throws Exception {
        double[] numeros = {1, 5, 3, 4, 6};
        double res = m.getMenorValor(numeros);
        assertEquals(1, res, 0.1);
    }

    @Test
    public void testeMaiorValor() throws Exception {
        double[] numeros = {1, 5, 3, 4, 6};
        double res = m.getMaiorValor(numeros);
        assertEquals(6, res, 0.1);
    }

    @Test
    public void testeNumeroAcimaMedia() throws Exception {
        double[] numeros = {1, 4, 3, 6, 5};
        double res = m.getNumeroAcimaMedia(numeros);
        assertEquals(3, res, 0.1);
    }
    
    @Test
    public void testeNumeroAbaixoMedia() throws Exception {
        double[] numeros = {1, 4, 3, 6, 5};
        double res = m.getNumeroAbaixoMedia(numeros);
        assertEquals(2, res, 0.1);
    }
    
    @Test(expected = Exception.class)
    public void testeNulo() throws Exception {
        double[] numeros = null;
        double res = m.getMediana(numeros);
    }
}
