package in.winny;

public class FinalVariableBike {
	 final int speedlimit=90;//final variable  
	 void run(){  
	  speedlimit=400;  
	 }  
	 public static void main(String args[]){  
	 FinalVariableBike obj=new  FinalVariableBike();  
	 obj.run();  
	 }  

}
