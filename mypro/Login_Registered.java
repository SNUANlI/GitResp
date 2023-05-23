import java.util.*;
public class Login_Registered {
	public static void main(String[] args) {
		int Num = 0;	//整形常量，便于控制switch循环
		int count = 1;	//记录注册的账户人数
		String[] Temp = new String[2];	//一维数组控制账号和密码的输入，记录每次注册方法时输入的账号及密码
		String Information[][] = new String[1][2];	//二维数组，其中第一个维度显示注册用户人数，第二个维度用于存储用户账号和密码，其中第二维度的[0]为账号,[1]为密码
		do {
			System.out.println("1.登录\n" + "2.注册\n" + "3.查看\n" + "4.退出\n");
			System.out.print("请输入指令:");
			Scanner OpNum = new Scanner(System.in);
			Num = OpNum.nextInt();
			switch(Num){
				case 1:
					Login(count,Information);	//传入当前录入人数及用户信息
					break;
				case 2:
					Temp = Registered();	//调用注册方法临时记录用户信息，同时将其取用
					Information[count-1][0] = Temp[0];	//正式录入用户信息
					Information[count-1][1] = Temp[1];
					Information = LengthAdd(Information);	//自定义方法实现二维数组Information的长度增加，以便存储更多用户
					count += 1;
					break;
				case 3:
					Display(count,Information);	 //传入当前录入人数及用户信息，用于总览输出用户信息
					break;
				case 4:
					System.out.print("\n退出成功!");
					break;
				default:
					break;
			}
		}while(Num != 4);
	}

	public static boolean Login(int count,String[][] Information) {
		System.out.print("\n登录\n");
		String Temp[] = new String[2];
		Scanner Information1 = new Scanner(System.in);
		Scanner Information2 = new Scanner(System.in);
		System.out.print("请输入账号:");
		Temp[0] = Information1.next();
		System.out.print("请输入密码:");
		Temp[1] = Information2.next();
		for(int i=0;i<count-1;i++)
			if(Temp[0].equals(Information[i][0]) == true && Temp[1].equals(Information[i][1]) == true && i<count-1) {
				System.out.println("登陆成功!\n");
				return true;}
		System.out.println("登陆失败!\n");
		return false;
	}
	
	public static String[] Registered(){
		System.out.print("\n注册\n");
		String Temp[] = new String[2];
		Scanner Information1 = new Scanner(System.in);
		Scanner Information2 = new Scanner(System.in);
		System.out.print("请输入账号:");
		Temp[0] = Information1.next();
		System.out.print("请输入密码:");
		Temp[1] = Information2.next();
		System.out.print("\n");
		return Temp;
	}
	
	public static void Display(int count,String[][] Information) {
		System.out.print("\n总览\n");
		for(int i=0;i<count-1;i++) {
			System.out.println("账号:" + Information[i][0]);
			System.out.println("密码:" + Information[i][1]);
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