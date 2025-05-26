public class Day1_Prob2_1
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 3; i++) 
        {
            for (int j = 1; j <= 3-i; j++) 
            {
                System.out.print(" ");
            }

            for (char m = 'A'; m <= (char)('A' + i - 2); m++) 
            {
                System.out.print(m);
            }

            for (char k = (char)('A' + i - 1); k >= 'A'; k--) 
            {
                System.out.print(k);
            }

            for(int p = 3 + i; p <= 5; p++) 
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}