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
        problem.setType("School-fees", PROBLEMTYPE.BUSINESS);
        person.addProblem("School-fees", PROBLEMTYPE.BUSINESS);
        person.isProblemExist(problem.getName(),problem.getType());
        assertEquals("School-fees", problem.getName());
        assertEquals(1, person.listOfProblems().size());
    }

    @Test
    public void testPersonHas1ProblemAndSolved1Problem() {
        problem.setName("School-fees");
        problem.setPROBLEMTYPE(PROBLEMTYPE.EDUCATION);
        problem.setType("School-fees", PROBLEMTYPE.EDUCATION);
        person.addProblem("School-fees", PROBLEMTYPE.EDUCATION);
        problem.setStatus(true);
        person.isProblemExist(problem.getName(),problem.getType());
        person.solveProblem("School-fees", problem.getType());
        assertTrue(true, String.valueOf(person.listOfProblems().size()));

    }

    @Test
    public void testPersonHas2ProblemsAndSolved1Problems() {
        problem.setName("School-fees");
        problem.setPROBLEMTYPE(PROBLEMTYPE.EDUCATION);
        person.addProblem("School-fees", PROBLEMTYPE.EDUCATION);
        problem.setStatus(true);
        person.isProblemExist(problem.getName(),problem.getType());
        person.solveProblem("School-fees", problem.getType());
        assertTrue(true, String.valueOf(person.listOfProblems().size()));

        problem.setName("House-rent");
        problem.setPROBLEMTYPE(PROBLEMTYPE.FINANCIAL);
        person.addProblem("House-rent", PROBLEMTYPE.FINANCIAL);
        person.isSolved(false);
        person.isProblemExist(problem.getName(),problem.getType());
        assertFalse(false, String.valueOf(person.listOfProblems().size()));
    }

}
