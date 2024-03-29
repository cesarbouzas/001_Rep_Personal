/**
 * 
 */
package variablesatomicas;

/**
 * @author Openwebinars
 *
 */
public class EjemploContadorAtomico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContadorAtomico contador = new ContadorAtomico();
		
		new Thread(()->{
			contador.incrementar();
			contador.incrementar();
			contador.incrementar();
			System.out.println(contador.valor());
			contador.incrementar();
			System.out.println(contador.valor());
			
		}).start();
		contador.incrementar();
		new Thread(()->{
			contador.decrementar();
			System.out.println(contador.valor());
			contador.decrementar();
			System.out.println(contador.valor());

		}).start();

		
	}

}
