package ec.edu.espe.MongoDBCRUD.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class GoalAverage {
    private int id;
    private String playerName;
    private double goalAverage;

    public GoalAverage(){
        playerName = "";
        goalAverage = 0;
    }
        
    public GoalAverage(String playerName, double goalAverage) {
        this.playerName = playerName;
        this.goalAverage = goalAverage;
    }

    @Override
    public String toString() {
        return "GoalAverage{" + "playerName=" + playerName + ", goalAverage=" + goalAverage + '}';
    }
        
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the goalAverage
     */
    public double getGoalAverage() {
        return goalAverage;
    }

    /**
     * @param goalAverage the goalAverage to set
     */
    public void setGoalAverage(double goalAverage) {
        this.goalAverage = goalAverage;
    }
    
    
    
}
