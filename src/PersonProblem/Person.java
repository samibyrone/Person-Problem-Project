package PersonProblem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private boolean isSolved = false;
    private List<Problem> problems = new ArrayList<>();


    public boolean isProblemExist(String name, PROBLEMTYPE type) {
        for (Problem problem : problems) {
            if (problem.getName().equals(name) && problem.getType().equals(type)) {
                return true;
            }
        }
        return false;
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public void solveProblem(Problem problem) {
        for (Problem myProblem1 : problems) {
            if (myProblem1.getName().equals(problem.getName()) && myProblem1.getType().equals(problem.getType())) {
                problems.remove(problem);
            }
        }
    }

    public List<Problem> listOfProblems() {
        return problems;
    }
}
