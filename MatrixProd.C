// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int A[10][10],B[10][10],C[10][10],i,j,k,r1,c1,r2,c2;
    printf("Enter no. of rows1: ");    
    scanf("%d",&r1);
    printf("Enter no. of columns1 : ");
    scanf("%d",&c1);
    printf("Enter no. of rows2: ");    
    scanf("%d",&r2);
    printf("Enter no. of columns2: ");
    scanf("%d",&c2);
    
    if(c1!=r2){
        printf("This multiplication is invalid");
        return 0;
    }
    printf("Enter elements of first array: ");
    for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            scanf("%d",&A[i][j]);
        }
    }
    printf("Elements of first array: \n");
    for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            printf("%d ",A[i][j]);
        }
        printf("\n");
    }
    printf("Enter elements of second array: ");
    for(i=0;i<r2;i++){
        for(j=0;j<c2;j++){
            scanf("%d",&B[i][j]);
        }
    }
    
    printf("Elements of second array:  \n");
    for(i=0;i<r2;i++){
        for(j=0;j<c2;j++){
            printf("%d ",B[i][j]);
        }
        printf("\n");
    }
    
    for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            C[i][j]=0;
            for(k=0;k<c1;k++){
                C[i][j]=C[i][j]+A[i][k]*B[k][j];
            }
        }
    }
     
     printf("Elements of result array:  \n");
    for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            printf("%d ",C[i][j]);
        }
        printf("\n");
    }
    
    

    return 0;
}
