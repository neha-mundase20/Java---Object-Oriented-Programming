import java.io.PrintStream;
import java.util.Scanner;

public class new_primenumbers
{
  public static void main(String[] args)
  {
    int flag = -1;
    
    int k = 0;
    int[] array = new int[20];
    int range;
    do
    {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the range:");
      range = obj.nextInt();
    } while (
    
      range < 1);
    for (int i = 1; i <= range; i++)
    {
      if (i == 1)
      {
        flag = 0;
      }
      else if (i % 2 == 0)
      {
        if (i == 2) {
          flag = 1;
        } 
        else {
          flag = 0;
        }
      }
      else
      {
        int n = (int)Math.ceil(Math.sqrt(i));
        for (int j = 3; j <= n; j++)
        {
          if (i % j == 0)
          {
            flag = 0;
            break;
          }
          flag = 1;
        }
      }
      if (flag == 1)
      {
        System.out.println(i);
        array[k] = i;
        k++;
      }
    }
    System.out.println(array[0] + "\t" + array[1]);
    for (int l = 1; l < k; l++) {
      if (array[(l + 1)] - array[l] == 2) {
        System.out.println(array[l] + "\t" + array[(l + 1)]);
      }
    }
  }
}
/*Enter the range:
20
2
3
5
7
11
13
17
19
2       3
3       5
5       7
11      13
17      19 */
