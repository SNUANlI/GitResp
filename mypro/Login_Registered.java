import java.util.*;
public class Login_Registered {
	public static void main(String[] args) {
		int Num = 0;	//���γ��������ڿ���switchѭ��
		int count = 1;	//��¼ע����˻�����
		String[] Temp = new String[2];	//һά��������˺ź���������룬��¼ÿ��ע�᷽��ʱ������˺ż�����
		String Information[][] = new String[1][2];	//��ά���飬���е�һ��ά����ʾע���û��������ڶ���ά�����ڴ洢�û��˺ź����룬���еڶ�ά�ȵ�[0]Ϊ�˺�,[1]Ϊ����
		do {
			System.out.println("1.��¼\n" + "2.ע��\n" + "3.�鿴\n" + "4.�˳�\n");
			System.out.print("������ָ��:");
			Scanner OpNum = new Scanner(System.in);
			Num = OpNum.nextInt();
			switch(Num){
				case 1:
					Login(count,Information);	//���뵱ǰ¼���������û���Ϣ
					break;
				case 2:
					Temp = Registered();	//����ע�᷽����ʱ��¼�û���Ϣ��ͬʱ����ȡ��
					Information[count-1][0] = Temp[0];	//��ʽ¼���û���Ϣ
					Information[count-1][1] = Temp[1];
					Information = LengthAdd(Information);	//�Զ��巽��ʵ�ֶ�ά����Information�ĳ������ӣ��Ա�洢�����û�
					count += 1;
					break;
				case 3:
					Display(count,Information);	 //���뵱ǰ¼���������û���Ϣ��������������û���Ϣ
					break;
				case 4:
					System.out.print("\n�˳��ɹ�!");
					break;
				default:
					break;
			}
		}while(Num != 4);
	}

	public static boolean Login(int count,String[][] Information) {
		System.out.print("\n��¼\n");
		String Temp[] = new String[2];
		Scanner Information1 = new Scanner(System.in);
		Scanner Information2 = new Scanner(System.in);
		System.out.print("�������˺�:");
		Temp[0] = Information1.next();
		System.out.print("����������:");
		Temp[1] = Information2.next();
		for(int i=0;i<count-1;i++)
			if(Temp[0].equals(Information[i][0]) == true && Temp[1].equals(Information[i][1]) == true && i<count-1) {
				System.out.println("��½�ɹ�!\n");
				return true;}
		System.out.println("��½ʧ��!\n");
		return false;
	}
	
	public static String[] Registered(){
		System.out.print("\nע��\n");
		String Temp[] = new String[2];
		Scanner Information1 = new Scanner(System.in);
		Scanner Information2 = new Scanner(System.in);
		System.out.print("�������˺�:");
		Temp[0] = Information1.next();
		System.out.print("����������:");
		Temp[1] = Information2.next();
		System.out.print("\n");
		return Temp;
	}
	
	public static void Display(int count,String[][] Information) {
		System.out.print("\n����\n");
		for(int i=0;i<count-1;i++) {
			System.out.println("�˺�:" + Information[i][0]);
			System.out.println("����:" + Information[i][1]);
			System.out.print("\n");}
	}
	
	public static String[][] LengthAdd(String[][] Array){
		String[][] NewArray = new String[Array.length+1][2];
		for(int i=0;i<Array.length;i++) {
			NewArray[i][0] = Array[i][0];
			NewArray[i][1] = Array[i][1];
		}
		return NewArray;
	}
}