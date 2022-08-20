package polymorphism;


	class FinalVariable{
		  final int i=10;//final variable
		  void print(){
		//   i=100;// cant be assinged
			  System.out.println(i);
		  }
	 public static void main(String args[]){
		  FinalVariable obj=new  FinalVariable();
		  obj.print();
		  }

}
