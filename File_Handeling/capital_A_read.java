/*
A3
Write a function in C++ to count and display the number of lines not starting with alphabet 'A' present in a text file "STORY.TXT".Example : If the file "STORY.TXT" contains the following lines, 
The roses are red.
A girl is playing there.
There is a playground.An aeroplane is in the sky.Numbers are not allowed in the password.
The function should display the output as 3.
*/
import java.util.*;
import java.io.*;
class capital_A_read
{
   public static void main(String args[])
    {
    
    InputStream fin=new InputStream();
    fin.readline(sample.txt);
    char str[100];
    int count = 0;
    int count1 = 0;
    while (!fin.eof())
    {
        fin.getline(str, 100);
        if (str[0] != 'A')
        {
            count++;
        }
        else if (str[0] == 'A' && str[1] == ' ')
        {
            count1++;
        }
    }
    System.out.println("The number of lines not starting with 'A' are:" << count << "\n";)
    System.out.println("The number of lines starting with 'A' are:" << count1 << "\n";)
    fin.close();
    return 0;
    }
}