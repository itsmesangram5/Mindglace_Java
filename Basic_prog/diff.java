class diff
{
 public static void main (String args[])
   {
     int a[]={12,3,17,11,9};
     
     for (int i=0;  i<a.length; i++)
     {
       for (int j=0; j<a.length; j++)
        {
          if (a[i]<a[j])
           {
              int temp =a[i];
               a[i]=a[j];
               a[j]=temp;
        }
       }
      }
       System.out.println("The diff bet min and max element is "+(a[a.length-1]-a[0]));
   }
  }