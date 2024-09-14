package PersonProblem;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private PROBLEMTYPE type;
    private boolean Status = Boolean.FALSE;
    private final List<Problem> problems = new ArrayList<>();


    public boolean isProblemExist(String ProblemName, PROBLEMTYPE type) {
        for (Problem problem : problems) {
            if (problem.getName().equals(ProblemName) && problem.getType().equals(type)) {
                return true;
            }
        }
        return false;
    }

    public void addProblem(String problemName, PROBLEMTYPE type) {
        Problem problem = new Problem();
        problem.setName(problemName);
        problem.setPROBLEMTYPE(type);
        problems.add(problem);
    }

    public void isSolved(boolean status) {
        this.Status = status;
    }

    public void solveProblem(String problemName, PROBLEMTYPE type) {
        for (int index = 0; index < problems.size(); index++) {
            Problem myProblem = problems.get(index);
            if (myProblem.getName().equals(problemName) && myProblem.getType().equals(type)) {
                problems.remove(myProblem);
            }
            else {
                throw new IllegalArgumentException("This problem does not exist");
            }
        }
    }

    public List<Problem> listOfProblems() {
        return problems;
    }
}
