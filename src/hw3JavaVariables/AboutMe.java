package hw3JavaVariables;

public class AboutMe {
	
	public String myName;//Here variable declared.
	public String fullName="Roksana Akter";// Here variable initialized.
	public byte myAge=60;
	public char myGender='F';
	public int mySalary= 54000;
	public float myGrade=3.4f;
	public short myCarPrice=3000;
    public long myBankBalance=110000000l;
    public boolean usCtitizen=true;
    public double myHeight=3.5;
    
    
    public static void main(String[] args) {
    	AboutMe myInformation=new AboutMe();
		System.out.println("My full name  is "  +  myInformation.fullName+ ".\nI am " + myInformation.myAge  +  " years old."  + "\nI am a " +myInformation.myGender+".");
	}
}