package generic;

public class Test {

	public static void main(String[] args) {
		Box<String> box=new Box<String>("Hello I'm Praveen");
		System.out.println(box.getvalue());
		System.out.println(box.container.getClass().getName());
		
		Box<Integer> boxx=new Box<Integer>(345);
		System.out.println(boxx.getvalue());
		System.out.println(boxx.container.getClass().getName());
		
		Box<Boolean> boxxx=new Box<Boolean>(true);
		System.out.println(boxxx.getvalue());
		 box.performSometask1();
		boxx.performSometask1();
		boxxx.performSometask1();
	}

}
