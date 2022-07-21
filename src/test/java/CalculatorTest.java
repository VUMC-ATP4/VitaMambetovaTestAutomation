import classroomSix.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

        @Test
        public void testSum(){
            System.out.println("Sis ir mans pirmais testing tests");
            Calculator calculator = new Calculator();
            int actualResult = calculator.sum(13, 25);
            int expectedResult = 38;
            Assert.assertEquals(actualResult, expectedResult);
        }
        @Test
    public void testMultiply(){
            Calculator calculator = new Calculator();
            int actualResult = calculator.multiply(5, 6);
            int expectedResult = 30;
            Assert.assertEquals(actualResult, expectedResult);
        }
    }


