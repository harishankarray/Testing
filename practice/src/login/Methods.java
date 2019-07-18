package login;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation	ob=new operation();
		ob.add();
		ob.add(5, 6);
		int s = ob.add1();
		System.out.println(s);
		
		int p = ob.add1(4, 8);
		System.out.println(p);
		
		
		}
	}
	class operation{
	void add(){
	int a;
	int b;
	int t;
	a=2;
	b=3;
	t=a+b;
	System.out.println(t);
				
		}
	void add(int a, int b){
	int t;
	t=a+b;
	System.out.println(t);
		
	}
	int add1(){
		int a;
		int b;
		int t;
		a=2;
		b=3;
		t=a+b;
		return t;
					
			}
	int add1(int a, int b){
		int t;
		t=a+b;
		return t;
			
		}
	
	
	}
