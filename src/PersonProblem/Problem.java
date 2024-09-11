package PersonProblem;


public class Problem {

    private Problem problem;
    private PROBLEMTYPE type;
    private boolean isSolved;
    private String name;




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(PROBLEMTYPE type) {
        this.type = type;
    }

    public PROBLEMTYPE getType() {
        return type;
    }

    public void setPROBLEMTYPE(PROBLEMTYPE type) {
        this.type = type;
    }

    public boolean isSolved(boolean isSolved) { return isSolved; }

    public void setStatus(boolean isSolved) {
        this.isSolved = isSolved;
    }

}
