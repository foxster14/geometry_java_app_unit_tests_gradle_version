package Gradle.Hw;
import shapes.Cone; //Needed to access the Cone class
import static org.junit.Assert.assertEquals; //Needed to access JUnit assert methods
import org.junit.Test; //Needed to access JUnit unit testing functionality

public class ConeTest {

    @Test //syntactial sugar
    public void surfaceAreaTest(){

        //Not neccessary to instantiate an object for static methods
        Cone coneVar = new Cone();
        double result = coneVar.surfaceAreaCalc(5,4);
        assertEquals(179.12, result, 178);

    }
    
}
