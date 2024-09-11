package PersonProblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

   private Person person;
   private Problem problem;

    @BeforeEach
    public void setUp() {
        person = new Person();
        problem = new Problem();
    }

    @Test
    public void testPersonHas1Problem() {
        problem.setName("School-fees");
        problem.setPROBLEMTYPE(PROBLEMTYPE.EDUCATION);
        person.addProblem(problem);
        person.isProblemExist(problem.getName(),problem.getType());
        assertEquals("School-fees", problem.getName());
        assertEquals(1, person.listOfProblems().size());
    }

}
