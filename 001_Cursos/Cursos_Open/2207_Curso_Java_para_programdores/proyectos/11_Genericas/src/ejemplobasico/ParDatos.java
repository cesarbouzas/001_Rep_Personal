package ejemplobasico;

public class ParDatos <T,S> {
	private T d1;
	private S d2;
	
   public ParDatos(T d1,S d2 ) {
	   this.d1=d1;
	   this.d2=d2;
	   
   }
   public T getDato1() {
	   return this.d1;
   }
   public S getDato2() {
	   return this.d2;
   }
   public void setDato1(T d1) {
	   this.d1=d1;
   }
	public void setDato2(S d2) {
		this.d2=d2;
	}
	
	public String toString() {
		return (""+(d1!=null?d1+",":"")+(d2!=null?d2:""));
	}
	

}
