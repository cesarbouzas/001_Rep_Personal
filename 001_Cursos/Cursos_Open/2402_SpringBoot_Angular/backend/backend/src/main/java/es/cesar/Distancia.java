package es.cesar;


import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="distancia")
public class Distancia {
	
	 

	    private String dist_Id; // Cambiado a "dist_Id" para coincidir con el objeto JSON
	    
	    private Date dist_Datetime;
	    @Id
	    private Float dist_Dist;
		public String getArd_Id() {
			return dist_Id;
		}
		public void setArd_Id(String ard_Id) {
			this.dist_Id = ard_Id;
		}
		public Date getArd_Datetime() {
			return dist_Datetime;
		}
		public void setArd_Datetime(Date ard_Datetime) {
			this.dist_Datetime = ard_Datetime;
		}
		public Float getArd_Dist() {
			return dist_Dist;
		}
		public void setArd_Dist(Float ard_Dist) {
			this.dist_Dist = ard_Dist;
		}
    


}