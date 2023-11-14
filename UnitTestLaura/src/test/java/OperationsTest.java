/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.unittestlaura.Operations;
import java.lang.System;


/**
 *
 * @author lasof
 */
public class OperationsTest {

    public OperationsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void NextNumber_UserNumberGTown_AddedANumber() {

        //Arrange
        int userNumber = 10;
        int expectedResult = 11;

        //Act
        int result = Operations.NextNumber(userNumber);

        //Assert
        assertEquals(11, result);

    }

    @Test
    public void IsDivisible_TwoIntegerNumbers_IsNotDivisible() {

        //Arrange
        int firstNumber = 5;
        int secondNumber = 6;

        //Act
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);

        //Assert
        assertFalse(methodResult);

    }

    //Ejercicios correspondientes 9-17
    //Ejercicio 9 prueba con valores positivos 
    @Test
    public void CalculateCylinder_ValidInputs_CalculatesVolume() {

        //Arrange
        double radius = 5.0;
        double height = 10.0;
        double expectedVolume = Operations.CalculateCylinder(radius, height);

        //Act
        double actualVolume = Operations.CalculateCylinder(radius, height);

        //Assert
        assertEquals(expectedVolume, actualVolume);
    }

    //Ejercicio 9 prueba con valores negativos
    @Test
    public void CalculateCylinder_NegativeRadius_ReturnsNegativeVolume() {
        // Arrange
        double radius = -2.0;
        double height = 10.0;

        // Act
        double actualVolume = Operations.CalculateCylinder(radius, height);

        // Assert
        assertEquals(-1.0, actualVolume);
    }

    @Test
    public void CalculateCylinder_NegativeHeight_ReturnsNegativeVolume() {
        // Arrange
        double radius = 2.0;
        double height = -10.0;

        // Act
        double actualVolume = Operations.CalculateCylinder(radius, height);

        // Assert
        assertEquals(-1.0, actualVolume);
    }

    //Ejercicio 17 
    @Test
    public void test_Number_RandomNumber() {
        String prueba= Operations.RandomNumber();
        System.out.println(prueba);
      
    }
}
