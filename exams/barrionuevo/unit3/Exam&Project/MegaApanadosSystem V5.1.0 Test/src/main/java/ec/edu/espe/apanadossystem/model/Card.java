package ec.edu.espe.apanadossystem.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Card {
    private String cardOwner;
    private String numberCard;
    private int cvcCard;
    private String dateVecCard;

    public Card(String cardOwner, String numberCard, int cvcCard, String dateVecCard) {
        this.cardOwner = cardOwner;
        this.numberCard = numberCard;
        this.cvcCard = cvcCard;
        this.dateVecCard = dateVecCard;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getCvcCard() {
        return cvcCard;
    }

    public void setCvcCard(int cvcCard) {
        this.cvcCard = cvcCard;
    }

    public String getDateVecCard() {
        return dateVecCard;
    }

    public void setDateVecCard(String dateVecCard) {
        this.dateVecCard = dateVecCard;
    }
    
    
}
