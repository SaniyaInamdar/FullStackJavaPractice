package arraysort;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		arr[0]=87;
		arr[1]=20;
		arr[2]=18;
		arr[3]=12;
		arr[4]=28;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
	
		for(int num:arr) {
			System.out.println(num);
		}

	}

}
