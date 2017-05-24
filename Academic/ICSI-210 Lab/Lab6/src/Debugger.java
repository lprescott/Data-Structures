public class Debugger {

	private String height;
	private String width;
	private String wid;
	private String hgt;
	public String getHeight()
	{
		//return height;
		return this.height;
	}
	public String getWidth()
	{
		//return wid;
		return this.width;
	}
	public void setDimension(String x,String y)
	{
		height=x;
		width=y;
	}

	
	public int getArea()
	{
		int width=Integer.parseInt(getWidth());
		int height=Integer.parseInt(getHeight());
		
		return width*height;
	}
	
	public void populateArray(int [] arr)
	{
		//for(int i=0;i<=arr.length;i++)
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=i;
			
	}
	
	public static void main(String[] args) 
	{
		Debugger d=new Debugger();
		d.setDimension("3","3");
		
		int y=d.getArea();
		System.out.println("Area of Rectangle:"+y);
		int[] arr=new int[5];
		d.populateArray(arr);
		}

}
