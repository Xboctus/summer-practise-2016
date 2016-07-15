package database;
// Generated 15.07.2016 9:53:11 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NumbersId generated by hbm2java
 */
@Embeddable
public class NumbersId  implements java.io.Serializable {


     private int iduser;
     private int iditem;
     private int idevent;
     private int value;

    public NumbersId() {
    }

    public NumbersId(int iduser, int iditem, int idevent, int value) {
       this.iduser = iduser;
       this.iditem = iditem;
       this.idevent = idevent;
       this.value = value;
    }
   


    @Column(name="iduser", nullable=false)
    public int getIduser() {
        return this.iduser;
    }
    
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }


    @Column(name="iditem", nullable=false)
    public int getIditem() {
        return this.iditem;
    }
    
    public void setIditem(int iditem) {
        this.iditem = iditem;
    }


    @Column(name="idevent", nullable=false)
    public int getIdevent() {
        return this.idevent;
    }
    
    public void setIdevent(int idevent) {
        this.idevent = idevent;
    }


    @Column(name="value", nullable=false)
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NumbersId) ) return false;
		 NumbersId castOther = ( NumbersId ) other; 
         
		 return (this.getIduser()==castOther.getIduser())
 && (this.getIditem()==castOther.getIditem())
 && (this.getIdevent()==castOther.getIdevent())
 && (this.getValue()==castOther.getValue());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIduser();
         result = 37 * result + this.getIditem();
         result = 37 * result + this.getIdevent();
         result = 37 * result + this.getValue();
         return result;
   }   


}


