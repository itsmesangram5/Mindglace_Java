class sumarray
{
 public static void main(String args[])
 {
  int a[]={12,23,78,21};
  int sum=0;
  for(int i=0;i<a.length;i++){
     int num=a[i];
     int temp=num;
     int dig=(temp%10);
     while(temp>1)
          {
           sum=sum+dig;
           temp=(temp/10);
           }
  }
  System.out.println("Sum of Digit in the Array is '"+sum+"'");
 }
}
