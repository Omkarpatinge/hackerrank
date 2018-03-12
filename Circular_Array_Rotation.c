#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
long a[10000000];

int main() {
long n,i,j,k,q;
    scanf("%ld",&n);
    scanf("%ld",&k);//shifts
    scanf("%ld",&q);//no of ques
    for(i=0;i<n;i++)
        {
        scanf("%ld",&a[i]);
    }
    
    while(k>n)
        {
        k = k-n;
    }
    
    for(i=0;i<q;i++)
        {
        scanf("%ld",&j);
       /* if((j-k)<0){
            j=j-k+n;
        printf("%ld \n",a[j]);
            }*/
      //  else{
        j = (j+n-k)%n  ;  
        printf("%ld \n",a[j]);
       // }
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
