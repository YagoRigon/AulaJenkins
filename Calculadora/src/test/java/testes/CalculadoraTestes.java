package testes;

import control.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTestes {
    @Test
    public void TesteSomar(){
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0,calc.somar(3.0,2.0),0.0);
    }
}
