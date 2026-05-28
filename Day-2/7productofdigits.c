#include<stdio.h>
int main(){
    int n, pro=1, rem;
    printf("Enter a number: ");
    scanf("%d",&n);
    while(n!=0){
        rem=n%10;
        pro=pro*rem;
        n=n/10;
    }
    printf("Product of digits = %d",pro);
    return 0;
}
