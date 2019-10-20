
class myException extends Exception
{
	private int ex;
	myException(int a){
		ex=a;
	}
	public String toString(){

		return "MyEXception"+" "+ex+"is less than zero";
	}
}

public class Test {

static void sum(int a,int b)throws myException{
	if(a<0){
		throw new myException(a);
	}
	else
	{
		System.out.println(a+b);
	}
}

	public static void main(String[] args) {
try{
	sum(-10, 10);
}
catch (myException e){
	System.out.println(e);
}
	}
}
