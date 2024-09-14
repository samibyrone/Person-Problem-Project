package PersonProblem;


public class Problem {

    private String problemName;
    private PROBLEMTYPE type;
    private boolean isSolved;




    public void setName(String problemName) {
        this.problemName = problemName;
    }

    public String getName() {
        return problemName;
    }

    public void setType(String problemDescription, PROBLEMTYPE type) {
        this.type = type;
    }

    public PROBLEMTYPE getType() {
        return type;
    }

    public void setPROBLEMTYPE(PROBLEMTYPE type) {
        this.type = type;
    }

    public boolean problemStatus() { return isSolved; }

    public void setStatus(boolean isSolved) {
        this.isSolved = isSolved;
    }

}
