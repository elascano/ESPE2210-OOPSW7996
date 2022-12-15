
package ec.edu.espe.WorldCup2022.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Team {
    private int id;
    private String team;
    private String player;
    private String confederacy;

    public Team(int id, String team, String player, String confederacy) {
        this.id = id;
        this.team = team;
        this.player = player;
        this.confederacy = confederacy;
    }
    
    public Team(){
        this.id = 0;
        this.team = "";
        this.player = "";
        this.confederacy = "";
    }

    @Override
    public String toString() {
        return "InfoTeams{" + "id=" + id + ", team=" + team + ", player=" + player + ", confederacy=" + confederacy + '}';
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getConfederacy() {
        return confederacy;
    }

    public void setConfederacy(String confederacy) {
        this.confederacy = confederacy;
    }
    
    
}
