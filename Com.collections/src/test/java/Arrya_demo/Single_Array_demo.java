package Arrya_demo;

public class Single_Array_demo {

	public static void main(String[] args) {
		
		
		int i[]=new int[6];
		
		i[0]=2;
		i[1]=8;
		i[2]=9;
		i[3]=12;
		i[4]=20;
		i[5]=36;
		
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) {
			
			System.out.println(i[j]);
			
			
		}
		
		Object ob[]=new Object[5];
		
		ob[0]=25;
		
		ob[1]=36;
		
		ob[2]=28;
		
		ob[3]="simran";
		
		ob[4]='v';
		
		int j=ob.length;
		
		System.out.println(j);
		
		for(int k=0;k<j ;k++) {
			
			System.out.println(ob[k]);
			
			
			
		}
		
		

	}

}
