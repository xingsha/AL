package Algorithms;



public class ExchangeMomey {

	public static void main(String[] args) {
		int money = 2134;
		String rs=change(money);
		System.out.println(rs);
	}
	
	public static String change(int money){
		final char[] data = new char[]{'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
		final char[] units = new char[]{'元','拾','佰','仟','万','拾','佰','仟','亿','拾','佰','仟','万'};
		StringBuffer sb= new StringBuffer();
		int index = 0;
		/*if(money%0.01 != 0){
			return "输入非法";
		}*/
		
		
		while(money != 0){
			sb.insert(0, units[index++]);
			int m=money%10;
			sb.insert(0, data[m]);
			money /= 10;
		}
	
		return sb.toString();
	}

}
