#include<stdio.h>
int main(){
    int n, orig, rev=0, rem;
    printf("Enter a number: ");
    scanf("%d",&n);
    orig=n;
    while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    if(orig==rev)
        printf("The number entered is Palindrome");
    else
        printf("The number entered is Not Palindrome");
    return 0;
}
