class Dev3{

    
	
	
	
	public static void main(String[]args)
	{
	    int value = 40;
		int[]arrValue={20,30,40,50,60,70,80,90};
		
		System.out.println(arrValue[4]);
		System.out.println(arrValue[2]);
		int leng=arrValue.length;
		System.out.println(leng);
		for(int i=0; i < leng;i++){
		    System.out.print("Normal For "+arrValue[i]+", ");
		}
		System.out.println();
		for(int temp:arrValue)
		{
		    System.out.println(temp);
		}	
    }		
}