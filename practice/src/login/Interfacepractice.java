package login;

public class Interfacepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BPUT19 rw119=new BPUT19();
		rw119.ok();
		rw119.success();
		
		BPUT20 rw120=new BPUT20();
		rw120.confirm();
		rw120.success();
		

	}

}

		interface BPUT{
			void success();
				
			
			
		}

		class BPUT19 implements BPUT{
			void ok(){
				System.out.println("19ok");
			}

			@Override
			public void success() {
				// TODO Auto-generated method stub
				
			}
		}
		
		class BPUT20 implements BPUT{
			void confirm(){
				System.out.println("confirm20");
			}

			@Override
			public void success() {
				// TODO Auto-generated method stub
				
			}
		}