package Arrya_demo;

public class Two_dimension_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object ob[][]=new Object[2][4];
		
		System.out.println(ob.length);
		
		System.out.println(ob[0].length);
		
		ob[0][0]="hi";
		ob[0][1]="sankar";
		ob[0][2]="how";
		ob[0][3]="are";
		
		ob[1][0]="you";
		ob[1][1]=31;
		ob[1][2]='a';
		ob[1][3]=25;
		
		
		System.out.println(ob[1][3]);
		
		for(int cell=0; cell<ob.length;cell++) {
			
			
			for(int coul=0; coul<ob[0].length;coul++) {
				
				
				System.out.println(ob[cell][coul]);
				
			}
		}
		
		
		
		
				
				
		

	}

}
