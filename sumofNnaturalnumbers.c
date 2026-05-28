#include<stdio.h>
int main(){
    int n, sum=0;
    printf("Enter the value of N: ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }
    printf("Sum of N natural numbers is = %d",sum);
    return 0;
}
