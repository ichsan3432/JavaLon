class Box{
	
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
	
	public Box (String color, String shape, int n){
		this.color = color;
		this.shape = shape;
		this.num = n;
		totalNumber= totalNumber+n;
	}
	
	public void insertBalls(int n){
		this.num +=n;
		totalNumber+=n;
		System.out.println (n +"�̃{�[������ꂽ�B");
	}
	
	public void removeBalls (int n){
		if(num >=n){
			num -=n;
			totalNumber -=n;
			System.out.println (n+"�̃{�[�������o���܂����B");
		} else {
			totalNumber-=num;
			System.out.println (num+"�̃{�[�������o���܂����B");
			num=0;
		}
	}
	
	public void displayInfo(int n){
		System.out.println (n+ "---�F : "+color+ "�` :"+"  "+ shape+ "  "+ "�� :" +num);
	}
	
	public static void displayTotalNumber(){
		System.out.println ("�{�[���̍��v��"+totalNumber+"�ł��B");
	}
}