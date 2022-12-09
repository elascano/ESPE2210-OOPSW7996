/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws21_crud.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class TVSet {
    private int id;
    private String tvBrand;
    private String remoteBrand;

    public TVSet(int id, String tvBrand, String remoteBrand) {
        this.id = id;
        this.tvBrand = tvBrand;
        this.remoteBrand = remoteBrand;
    }

    public TVSet() {
        id = 0;
        tvBrand = "";
        remoteBrand = "";
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
     * @return the tvBrand
     */
    public String getTvBrand() {
        return tvBrand;
    }

    /**
     * @param tvBrand the tvBrand to set
     */
    public void setTvBrand(String tvBrand) {
        this.tvBrand = tvBrand;
    }

    /**
     * @return the remoteBrand
     */
    public String getRemoteBrand() {
        return remoteBrand;
    }

    /**
     * @param remoteBrand the remoteBrand to set
     */
    public void setRemoteBrand(String remoteBrand) {
        this.remoteBrand = remoteBrand;
    }
    
    
}
