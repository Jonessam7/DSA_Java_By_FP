package August18_DSA01;

public class construnctors {
	int val = 10;
	int b = 20;
	construnctors(){

	}
	construnctors(int val, int b){
		this.val=val;
		this.b=b;
	}
	void show(){
		System.out.println( "val->"+val+"\n"+"b->"+b);
	}

	public static void main(String[] args) {
		construnctors c = new construnctors();
		c.show();
		construnctors b = new construnctors(70,80);
		b.show();
	}
}
