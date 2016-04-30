package Algorithms;

public class RMB{

	public static void main(String[]args){
		char []st=new char[]{'0','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
		String str=null;
		str=args[0];
		System.out.println(str);
	try{
		if(!str.contains("\\.")){
			str+='.';
			str+="00";
		}
		String []rmb=str.split("\\.");
		for(int i=0;i<rmb.length;i++){	
			System.out.println(rmb[i]);
		}
		char[] s1=rmb[0].toCharArray();
		char[] s2=rmb[1].toCharArray();

		char [] m1=new char[s1.length];//存
		char [] m2=new char[2];
		for(int i=0;i<s1.length;i++){
			int k=s1[i]-'0';
			m1[i]=st[k];
			//System.out.print(m1[i]+"\t");
		}
		System.out.println();
		if(s2.length>=2){
			for(int i=0;i<2;i++){
				int t=s2[i]-'0';
				m2[i]=st[t];
				//System.out.print(m2[i]+"\t");
			}
		}else{
			int t1=s2[0]-'0';
			m2[0]=st[t1];
			m2[1]='0';
		}
/* **** ****/
		System.out.print("\n人民币 ");
		if(m1.length>8){
			print1(m1);             //到了亿位
		}else if(m1.length>4){
			print2(m1);				//在亿位和万位之间
		}
		else if(m1.length>0){
			print3(m1);				//万位以下
		}
		if(m1.length!=1||m1[0]!='0'){//防止0.01这种情况
			System.out.print("元");
		}
		//System.out.print("元");
		if(m2[0]=='0'&&m2[1]=='0')
			System.out.print("整");

//处理小数位
		if(m2[0]!='0'){
			if(isZero(m1,m1.length+2,m1.length-1)){
				System.out.print("零");
			}
			System.out.print(m2[0]+"角");
		}else if(m2[1]!='0'){
			System.out.print("零");
		}
		if(m2[1]!='0'){
			System.out.print(m2[1]+"分");
		}
	}catch(Exception e){
		System.out.println("输入非法");
	}


	}
	public static void print1(char s[]){//亿位之前有数字
		int l1=s.length;
		print(s,0,l1-9);//l1代表位数
		System.out.print("亿");
		//if(print(s,l1-8,l1-5)!=0)
		print(s,l1-8,l1-5);
		if(!isZero(s,l1-8,l1-5))//是否四位全为零
			System.out.print("萬");
		print(s,l1-4,l1-1);

	}
	public static void print2(char s[]){
		int l1=s.length;
		print(s,0,l1-5);//l1代表位数
		System.out.print("萬");
		print(s,l1-4,l1-1);

	}
	public static void print3(char s[]){
		int l1=s.length;
		print(s,0,l1-1);//l1代表位数

	}
	public static boolean isZero(char s[],int lo,int hi){//判断是否全为零
		if(lo<0){
			return false;
		}
		for(int i=lo;i<=hi;i++){
			if(s[i]!='0'){
				return false;
			}
		}
		return true;
	}

	public static int print(char s[],int lo,int hi){
		int len=hi-lo+1;
		switch(len){
			case 5:		
				System.out.print(s[lo]+"萬");
				if(s[lo+1]=='0'&&s[lo]!='0'){	
					System.out.print("零");
				}else{
					System.out.print(s[lo+1]+"仟");
				}
				if(s[lo+2]=='0'&&s[lo+1]!='0'){
					System.out.print("零");					
				}else if(s[lo+2]!='0'){
					System.out.print(s[lo+2]+"佰");
				}
				if(s[lo+3]=='0'&&s[lo+2]!='0'){
					System.out.print("零");					
				}else if(s[lo+3]!='0'){
					System.out.print(s[lo+3]+"拾");
				}
				if(s[hi]!='0')
					System.out.print(s[hi]);
				break;
			case 4:
				//if(s[lo]=='0'&&s[lo+1]=='0'&&s[lo+2]=='0'&&s[lo+3]=='0'){
				if(isZero(s,lo,hi)&&(!isZero(s,hi+1,s.length-1))){
					System.out.print("零");
					return 0;
				}
				if(s[lo]!='0'){
					System.out.print(s[lo]+"仟");
				}else if(!isZero(s,lo+1,lo+3)){
					System.out.print("零");
				}
				if(s[lo+1]!='0'){
					System.out.print(s[lo+1]+"佰");
				}else if(!isZero(s,lo+2,lo+3)&&s[lo]!='0'){
					System.out.print("零");
				}
				if(s[lo+2]!='0'){
					System.out.print(s[lo+2]+"拾");
				}else if(!isZero(s,lo,lo+1)&&s[lo+3]!='0'){
					System.out.print("零");
				}		
				if(s[hi]!='0')
					System.out.print(s[hi]);
				break;
			case 3:
				if(isZero(s,lo,hi)&&(!isZero(s,hi+1,s.length-1))){
					System.out.print("零");
					return 0;
				}
				if(s[lo]!='0'){
					System.out.print(s[lo]+"佰");
				}
				if(s[lo+1]!='0'){
					System.out.print(s[lo+1]+"拾");
				}else if(s[lo]!='0'&&s[hi]!='0'){
					System.out.print("零");
				}
				if(s[hi]!='0'){
					System.out.print(s[hi]);
				}
				break;
			case 2:
				System.out.print(s[lo]+"拾");
				if(s[hi]!='0')
					System.out.print(s[hi]);
				break;
			case 1:
				if(s[hi]!='0')
					System.out.print(s[hi]);
				break;
		}
		return 1;

	}

}



