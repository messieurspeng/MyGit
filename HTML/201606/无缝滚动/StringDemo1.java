class  StringDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		String s="    adafdag    ";
		s=myTrim(s);
		sop(s);
	}
	public static String myTrim(String str)
	{
		int start=0,end=str.length()-1;
		while(start<=end && str.charAt(start)==' ')
			start++;
		while(start<=end && str.charAt(end)==' ')
			end--;
		return str.substring(start,end+1);
	}
}
