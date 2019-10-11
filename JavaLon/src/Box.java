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
		System.out.println (n +"個のボールを入れた。");
	}
	
	public void removeBalls (int n){
		if(num >=n){
			num -=n;
			totalNumber -=n;
			System.out.println (n+"個のボールを取り出しました。");
		} else {
			totalNumber-=num;
			System.out.println (num+"個のボールを取り出しました。");
			num=0;
		}
	}
	
	public void displayInfo(int n){
		System.out.println (n+ "---色 : "+color+ "形 :"+"  "+ shape+ "  "+ "個数 :" +num);
	}
	
	public static void displayTotalNumber(){
		System.out.println ("ボールの合計は"+totalNumber+"個です。");
	}
}