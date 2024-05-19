package Q4;

public class Q4 {
	public static void main(String[] args) {

		int arr[]= new int[] {10,70,20,30,10,40,30,20,50,60,50,50,50,50,30,30,90,40};
		
		int count=0;
		int mode= Integer.MIN_VALUE;
		
		for (int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(mode< count) {
				mode= count;
			}
			count =0;
			
		}
		System.out.println("mode is : "+mode);
		
	}

}
