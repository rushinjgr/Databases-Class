package dbfiller;
// Generated Apr 2, 2014 5:48:38 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * PlayInTeamId generated by hbm2java
 */
public class PlayInTeamId  implements java.io.Serializable {


     private BigDecimal playerId;
     private BigDecimal teamId;
     private Date fromDate;

    public PlayInTeamId() {
    }

    public PlayInTeamId(BigDecimal playerId, BigDecimal teamId, Date fromDate) {
       this.playerId = playerId;
       this.teamId = teamId;
       this.fromDate = fromDate;
    }
   
    public BigDecimal getPlayerId() {
        return this.playerId;
    }
    
    public void setPlayerId(BigDecimal playerId) {
        this.playerId = playerId;
    }
    public BigDecimal getTeamId() {
        return this.teamId;
    }
    
    public void setTeamId(BigDecimal teamId) {
        this.teamId = teamId;
    }
    public Date getFromDate() {
        return this.fromDate;
    }
    
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PlayInTeamId) ) return false;
		 PlayInTeamId castOther = ( PlayInTeamId ) other; 
         
		 return ( (this.getPlayerId()==castOther.getPlayerId()) || ( this.getPlayerId()!=null && castOther.getPlayerId()!=null && this.getPlayerId().equals(castOther.getPlayerId()) ) )
 && ( (this.getTeamId()==castOther.getTeamId()) || ( this.getTeamId()!=null && castOther.getTeamId()!=null && this.getTeamId().equals(castOther.getTeamId()) ) )
 && ( (this.getFromDate()==castOther.getFromDate()) || ( this.getFromDate()!=null && castOther.getFromDate()!=null && this.getFromDate().equals(castOther.getFromDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPlayerId() == null ? 0 : this.getPlayerId().hashCode() );
         result = 37 * result + ( getTeamId() == null ? 0 : this.getTeamId().hashCode() );
         result = 37 * result + ( getFromDate() == null ? 0 : this.getFromDate().hashCode() );
         return result;
   }   


}


