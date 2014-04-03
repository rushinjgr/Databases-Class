package dbfiller;
// Generated Apr 2, 2014 5:48:38 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Player generated by hbm2java
 */
public class Player  implements java.io.Serializable {


     private BigDecimal playerId;
     private String firstname;
     private String lastname;
     private Date birthdate;
     private String country;
     private Set playInTeams = new HashSet(0);

    public Player() {
    }

	
    public Player(BigDecimal playerId) {
        this.playerId = playerId;
    }
    public Player(BigDecimal playerId, String firstname, String lastname, Date birthdate, String country, Set playInTeams) {
       this.playerId = playerId;
       this.firstname = firstname;
       this.lastname = lastname;
       this.birthdate = birthdate;
       this.country = country;
       this.playInTeams = playInTeams;
    }
   
    public BigDecimal getPlayerId() {
        return this.playerId;
    }
    
    public void setPlayerId(BigDecimal playerId) {
        this.playerId = playerId;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Date getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public Set getPlayInTeams() {
        return this.playInTeams;
    }
    
    public void setPlayInTeams(Set playInTeams) {
        this.playInTeams = playInTeams;
    }




}

