import java.util.*;

public class ren200_9{
	
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		
		Box bulat = new Box("��", "�~�`", 1);

		Box kotak = new Box("��", "�l�`", 2);
		
		System.out.println ("�������͂��Ă������� >");
		System.out.print ("�{�[������(1), �{�[����o(2), �{�[�������\��(3), �I��(��) >");
		
		int n = input.nextInt();	
		while (1<=n && n <=3){
			switch (n) {
				case 1 :
				bulat.displayInfo(0);
				kotak.displayInfo(1);
				
				System.out.print("�{�[���𓊓����锠�̔ԍ�����͂��Ă������� >");
				int s = input.nextInt();
				if(s == 0){
					System.out.print("��������{�[���̌�����͂��Ă������� >");
					int m = input.nextInt();
					bulat.insertBalls(m);
				}else if(s==1){
					System.out.print("��������{�[���̌�����͂��Ă������� >");
					int m = input.nextInt();
					kotak.insertBalls(m);
				}else
					System.out.println ("���̔ԍ����Ⴄ");
				break;
				
				case 2:
				bulat.displayInfo(0);
				kotak.displayInfo(1);
				
				System.out.print("�{�[�������o�����̔ԍ�����͂��Ă������� >");
				 s = input.nextInt();
				if(s == 0){
					System.out.print("���o���{�[���̌�����͂��Ă������� >");
					int m = input.nextInt();
					bulat.removeBalls(m);
				}else if(s==1){
					System.out.print("���o���{�[���̌�����͂��Ă������� >");
					int m = input.nextInt();
					kotak.removeBalls(m);
				}else
					System.out.println ("���̔ԍ����Ⴄ");	
				break;
				
				case 3:
					bulat.displayInfo(0);
					kotak.displayInfo(1);
					Box.displayTotalNumber();
				break;
			}
			System.out.println ("�������͂��Ă������� >");
			System.out.print ("�{�[������(1), �{�[����o(2), �{�[�������\��(3), �I��(��) >");
		
			n = input.nextInt();
			
		}
	}
}