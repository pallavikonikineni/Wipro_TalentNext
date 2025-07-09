package java_fundamentals;
public class Array14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=9){
			System.out.println("Please enter 9 integer numbers");
			return;
		}
		int[][]a=new int[3][3];
		int k=0,max=Integer.MIN_VALUE;
		System.out.println("The given array is :");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=Integer.parseInt(args[k++]);
				System.out.print(a[i][j]+" ");
				if(a[i][j]>max)max=a[i][j];
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is "+max);
	}
}
