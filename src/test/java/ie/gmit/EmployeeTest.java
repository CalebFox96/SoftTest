/*
Name: Caleb Fox
Date: 09/03/2020
G00327455

Employee Test class for payroll system

*/
package ie.gmit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    void setup(){

    }
    @DisplayName("Test")
    @Test
    void testConstructor(){
        Employee myEmployee = new Employee("mr","caleb","12345678","123456789","full",23);
        assertEquals("mr",myEmployee.getTitle());

    }
    @Test
    void testTitleConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new
                Employee("","caleb","12345678","123456789","full",23));

    }
    @Test
    void testNameConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new
                Employee("mr","","12345678","123456789","full",23));

    }
    @Test
    void testPPSConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new
                Employee("mr","caleb","1234567","123456789","full",23));

    }
    @Test
    void testNumConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new
                Employee("mr","caleb","12345678","12345678","full",23));

    }
    @Test
    void testETConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new
                Employee("mr","caleb","12345678","123456789","unemployed",23));

    }
    @Test
    void testAgeConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new
                Employee("mr","caleb","12345678","123456789","full",15));

    }

}
