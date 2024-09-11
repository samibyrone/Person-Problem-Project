package PersonProblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static PersonProblem.PROBLEMTYPE.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {

    Problem problem;
    Person person;

    @BeforeEach
    public void problemTestSetup() {
        problem = new Problem();
        person = new Person();
    }

    @Test
    public void testThatProblemExist() {
        problem.setName("School-fees");
        problem.setPROBLEMTYPE(EDUCATION);
        problem.setStatus(true);
        assertTrue(person.isProblemExist("School-fees", EDUCATION));
    }

    @Test
    public void testThatProblemHasBeenSolved() {
        problem.setName("product");
        problem.setPROBLEMTYPE(BUSINESS);
        problem.isSolved(true);
        assertFalse(!person.isProblemExist("product", BUSINESS));
    }

    @Test
    public void testThatPersonHasMoreThan1Problem() {
        problem.setName("House-rent");
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        assertTrue(person.isProblemExist("House-rent", FINANCIAL));

        Problem problem1 = new Problem();
      //  Person person1 = new Person();
        problem1.setName("Textbook");
        problem1.setPROBLEMTYPE(EDUCATION);
        problem1.setStatus(true);
        assertTrue(person.isProblemExist("Textbook", EDUCATION));
    }

    @Test
    public void testThatPersonHas2ProblemAnd1HasBeenSolved() {
        problem.setName("House-rent");
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        problem.isSolved(true);
        assertTrue(person.isProblemExist("House-rent", FINANCIAL));

        problem.setName("Textbook");
        problem.setPROBLEMTYPE(EDUCATION);
        problem.setStatus(true);
        problem.isSolved(false);
        assertFalse(!person.isProblemExist("Textbook", EDUCATION));
    }

    @Test
    public void testThatPersonHas2ProblemAnd2HasBeenSolved() {
        problem.setName("Car-Maintenance");
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        problem.isSolved(true);
        assertFalse(person.isProblemExist("Car-maintenance", FINANCIAL));

        problem.setName("School-fees");
        problem.setPROBLEMTYPE(EDUCATION);
        person.isProblemExist("School-fees", EDUCATION);
        problem.setStatus(true);
        problem.isSolved(true);
        assertTrue(person.isProblemExist("School-fees", EDUCATION));
    }

    @Test
    public void testThatPersonHas3ProblemAnd2HasBeenSolved() {
        problem.setName("Household-Upkeep");
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        problem.isSolved(true);
        assertTrue(person.isProblemExist("Household-Upkeep", FINANCIAL));

        problem.setName("School-Laptop");
        problem.setPROBLEMTYPE(EDUCATION);
        problem.setStatus(true);
        problem.isSolved(true);
        assertTrue(person.isProblemExist("School-Laptop", EDUCATION));

        problem.setName("Emergency-Fire-Outbreak");
        problem.setPROBLEMTYPE(BUSINESS);
        problem.setStatus(true);
        problem.isSolved(false);
        assertFalse(!person.isProblemExist("Emergency_Fire_outbreak", BUSINESS));
    }

}
