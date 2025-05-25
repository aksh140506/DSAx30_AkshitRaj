#include<stdio.h>
int main()
{
    int a[3][3];
    int i,j;
    printf("Enter elements of the matrix : \n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    int p=0, q=0;
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            p = p + a[i][j];
        }
        printf("The sum of the elements of the row %d is %d\n",i+1,p);
        p=0;
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            q = q + a[j][i];
        }
        printf("The sum of the elements of the coulumn %d is %d\n",i+1,q);
        q=0;
    }
}