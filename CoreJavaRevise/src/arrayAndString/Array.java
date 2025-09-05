package arrayAndString;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		for(int value:arr) {
			System.out.println(value);
		}
		
		
		int arr1[][]=new int[5][5];
		for(int j=0;j<arr1.length;j++) {
			for(int k=0;k<arr1.length;k++) {
				arr1[j][k]=(int)(Math.random()*100);
				System.out.print(arr1[j][k]+" ");
			}
			System.out.println();
		}
		
	}

}
