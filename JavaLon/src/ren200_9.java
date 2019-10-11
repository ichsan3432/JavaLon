import java.util.*;

public class ren200_9{
	
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		
		Box bulat = new Box("赤", "円形", 1);

		Box kotak = new Box("青", "四形", 2);
		
		System.out.println ("操作を入力してください >");
		System.out.print ("ボール投入(1), ボール取出(2), ボール総数表示(3), 終了(他) >");
		
		int n = input.nextInt();	
		while (1<=n && n <=3){
			switch (n) {
				case 1 :
				bulat.displayInfo(0);
				kotak.displayInfo(1);
				
				System.out.print("ボールを投入する箱の番号を入力してください >");
				int s = input.nextInt();
				if(s == 0){
					System.out.print("投入するボールの個数を入力してください >");
					int m = input.nextInt();
					bulat.insertBalls(m);
				}else if(s==1){
					System.out.print("投入するボールの個数を入力してください >");
					int m = input.nextInt();
					kotak.insertBalls(m);
				}else
					System.out.println ("箱の番号が違う");
				break;
				
				case 2:
				bulat.displayInfo(0);
				kotak.displayInfo(1);
				
				System.out.print("ボールを取り出す箱の番号を入力してください >");
				 s = input.nextInt();
				if(s == 0){
					System.out.print("取り出すボールの個数を入力してください >");
					int m = input.nextInt();
					bulat.removeBalls(m);
				}else if(s==1){
					System.out.print("取り出すボールの個数を入力してください >");
					int m = input.nextInt();
					kotak.removeBalls(m);
				}else
					System.out.println ("箱の番号が違う");	
				break;
				
				case 3:
					bulat.displayInfo(0);
					kotak.displayInfo(1);
					Box.displayTotalNumber();
				break;
			}
			System.out.println ("操作を入力してください >");
			System.out.print ("ボール投入(1), ボール取出(2), ボール総数表示(3), 終了(他) >");
		
			n = input.nextInt();
			
		}
	}
}