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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void testeMedianaVetor() {
        double[] numeros = {1, 2, 3, 4, 5};
        Mediana m = new Mediana();
        double res = m.getMediana(numeros);
        assertEquals(4, res, 0.1);
               
    }
}