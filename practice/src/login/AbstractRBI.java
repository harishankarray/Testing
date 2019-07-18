package login;

public class AbstractRBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI objsbi =new SBI();
		objsbi.add();
		objsbi.delete();
	
		RBI objab = new AB();
		objab.add();
		objab.delete();
		
		RBI objicici = new ICICI();
		objicici.add();
		objicici.delete();
		
		
	}

}

		 abstract class RBI {
		 abstract void add();
		abstract void delete();	
		
		}
		 
		 class SBI extends RBI{
			 void cancel(){
				 System.out.println("SBI cancel");
			 }
			 void add(){
				System.out.println("add in SBI");	 
			 }
		 void delete(){
			 System.out.println("delete in SBI");
		 }
		 
		 }
		 
		 
		 class AB extends RBI{
			 void update(){
				 System.out.println("AB update");
			 }

			@Override
			void add() {
				// TODO Auto-generated method stub
				System.out.println("add in AB");
			}

			@Override
			void delete() {
				// TODO Auto-generated method stub
				System.out.println("delete in AB");
			}
			 
		 }
		 
		 class ICICI extends RBI{
			 void info(){
				 System.out.println("ICICI info");
			 }

			@Override
			void add() {
				// TODO Auto-generated method stub
				System.out.println("add in ICICI");
			}

			@Override
			void delete() {
				// TODO Auto-generated method stub
				System.out.println("delete in ICICI");
			}
		 }