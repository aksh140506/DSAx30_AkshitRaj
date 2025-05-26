public class Day1_Prob2_2 
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 6; i++) 
        {
            for (int j = 1; j <= 6-i; j++) 
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

            for(int p = 6 + i; p <= 11; p++) 
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
