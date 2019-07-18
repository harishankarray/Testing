package login;

public class JNTU {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JNTU19 rw119=new JNTU19();
		rw119.Studentname="Hari";
		rw119.Rollno=23;
		rw119.Ok();
		
		JNTU19 rw219=new JNTU19();
		rw219.Studentname="vijay";
		rw219.Rollno=33;
		rw219.Ok();
		
		
		JNTU20 rw120=new JNTU20();
		rw120.Cityname="hyd";
		rw120.success();
		rw120.Studentname="Ajay";
		rw120.Rollno=43;
		rw120.Ok();
		JNTU20 rw220=new JNTU20();
		rw220.Studentname="Sujay";
		rw220.Rollno=53;
		rw220.Cityname="Blr";
		rw220.Ok();
		rw220.success();
		
		
		JNTU21 rw121=new JNTU21();
		rw121.Mobno=984874529;
		rw121.confirm();
		rw121.Studentname="manoj";
		rw121.Rollno=63;
		rw121.Cityname="delhi";
		rw121.Ok();
		rw121.success();
		rw121.confirm();
		
		
		
		
		
	}

}

	class JNTU19{
		String Studentname;
		int Rollno;
		void Ok(){
		System.out.println("ok JNTU19");	
		}
		
	}
	class JNTU20 extends JNTU19{
		String Cityname;
		void success(){
			System.out.println("ok JNTU20");
		}
		
		
	}
	class JNTU21 extends JNTU20{
		int Mobno;
		void confirm(){
			System.out.println("confirm 21");
		}
	}
	
	
	