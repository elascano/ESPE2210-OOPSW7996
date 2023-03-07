
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class ReportProblem {
  private String problem;
  private String specification;

    @Override
    public String toString() {
        return "ReportProblems{" + "problem=" + problem + ", specification=" + specification + '}';
    }

    public ReportProblem(String problem, String specification) {
        this.problem = problem;
        this.specification = specification;
    }

    /**
     * @return the problem
     */
    public String getProblem() {
        return problem;
    }

    /**
     * @param problem the problem to set
     */
    public void setProblem(String problem) {
        this.problem = problem;
    }

    /**
     * @return the specification
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * @param specification the specification to set
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }
  
}
