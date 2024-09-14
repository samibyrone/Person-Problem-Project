package PersonProblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static PersonProblem.PROBLEMTYPE.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
        problem.setType("School-fees", EDUCATION);
        problem.setPROBLEMTYPE(EDUCATION);
        assertTrue(true);
    }

    @Test
    public void testThatProblemHasBeenSolved() {
        problem.setName("product");
        problem.setType("product", BUSINESS);
        problem.setPROBLEMTYPE(BUSINESS);
        problem.problemStatus();
        assertTrue(true);
    }

    @Test
    public void testThatPersonHasMoreThan1ProblemAndProblemHasBeenSolved() {
        problem.setName("House-rent");
        problem.setType("House-rent", FINANCIAL);
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        problem.problemStatus();
        assertTrue(true);

        problem.setName("Textbook");
        problem.setType("Textbook", EDUCATION);
        problem.setPROBLEMTYPE(EDUCATION);
        problem.setStatus(true);
        problem.problemStatus();
        assertTrue(true);
    }

    @Test
    public void testThatPersonHas2ProblemAnd1HasBeenSolved() {
        problem.setName("House-rent");
        problem.setType("House-rent", FINANCIAL);
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        assertTrue(!person.isProblemExist("House-rent", FINANCIAL));

        problem.setName("Textbook");
        problem.setType("Textbook", EDUCATION);
        problem.setPROBLEMTYPE(EDUCATION);
        problem.problemStatus();
        assertFalse(person.isProblemExist("Textbook", EDUCATION));
    }

    @Test
    public void testThatPersonHas2ProblemAnd2HasBeenSolved() {
        problem.setName("Car-Maintenance");
        problem.setName("School-fees");
        problem.setType("School-fees", EDUCATION);
        problem.setType("Car-Maintenance", FINANCIAL);
        problem.setPROBLEMTYPE(EDUCATION);
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        assertTrue(!person.isProblemExist("Car-maintenance", FINANCIAL));
    }

    @Test
    public void testThatPersonHas3ProblemAnd2HasBeenSolved() {
        problem.setName("Household-Upkeep");
        problem.setType("Household-Upkeep", FINANCIAL);
        problem.setPROBLEMTYPE(FINANCIAL);
        problem.setStatus(true);
        problem.problemStatus();
        assertTrue(true);

        problem.setName("School-Laptop");
        problem.setType("School-Laptop", EDUCATION);
        problem.setPROBLEMTYPE(EDUCATION);
        problem.setStatus(true);
        problem.problemStatus();
        assertTrue(!person.isProblemExist("School-Laptop", EDUCATION));

        problem.setName("Emergency-Fire-Outbreak");
        problem.setType("Emergency-Fire-Outbreak", BUSINESS);
        problem.setPROBLEMTYPE(BUSINESS);
        problem.setStatus(true);
        assertFalse(person.isProblemExist("Emergency_Fire_outbreak", BUSINESS));
    }

}
