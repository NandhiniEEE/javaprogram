public class DemoTestArrays {
	  public static void main(String[] args){
		  int arrOne[]={1,2,3,4,5};
		  int arrTwo[]={0,0,0,0,0};

		  for (int i=0; i<arrOne.length;i++){
			   arrTwo[i]=arrOne[arrOne.length -i-1];
		  }

		  System.out.println(Arrays.toString(arrTwo));
      }
}
