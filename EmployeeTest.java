package SONALIRN;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testGetters() {
        Employee emp = new Employee("John Doe", 50000, 30);
        assertEquals("John Doe", emp.getName());
        assertEquals(50000, emp.getSalary(), 0);
        assertEquals(30, emp.getAge());
    }
}
