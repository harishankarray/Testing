package login;

public class OverloadingJNTU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JNTU22 obj22=new JNTU22();
		obj22.add();
		obj22.add(5, 7);
		obj22.add(2f, 5f);
		
		
	}

}

		class JNTU22{
			void add(){
			int a;
			int b;
			int t;
			a=2;
			b=3;
			t=a+b;
			System.out.println(t);
			}
			
			void add (int a, int b){
				int t;
				t = (a+b);
				System.out.println(t);
			}
			
			void add (float a, float b) {
				float t;
				t = (a+b);
				System.out.println(t);
			}
			
		}
		
