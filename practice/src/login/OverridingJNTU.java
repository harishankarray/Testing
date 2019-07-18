package login;

public class OverridingJNTU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*JNTU23 obj23 = new JNTU23();
		obj23.ok();*/
		
		JNTU24 obj24 = new JNTU24();
		obj24.ok();
	
	}

}

		class JNTU23 {
			int i = 5;
			void ok (){
				System.out.println(i);
			}
			
		}
		
		class JNTU24 extends JNTU23 {
			
			int i =10;
			void ok(){
				System.out.println(super.i);
			}
		}