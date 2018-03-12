#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int lowest(int a[],int n){
    int i,temp;
    int j=a[0];
    for(i=1;i<n;i++){
        if(a[i]>j)
            {
            temp=i;
            j=a[i];
        }
    }
    j=a[temp];
    for(i=0;i<n;i++){
        if(a[i]<j&&a[i]!=0)
            {
            temp=i;
            j=a[i];      
        }
    }
    
    return j;
}
int nonzero(int a[],int n){
    int i,nz=0;
    for(i=0;i<n;i++){
        if(a[i]!=0)
            nz++;
    }
    return nz;
}

int main(){
    int n,i,l,j; 
    scanf("%d",&n);
    int arr[n];
    for(int arr_i = 0; arr_i < n; arr_i++){
       scanf("%d",&arr[arr_i]);
    }
    printf("%d \n",nonzero(arr,n));
    for(i=1;i<nonzero(arr,n);)
    {
        l=lowest(arr,n);
        for(j=0;j<n;j++){
            if(arr[j]!=0){
           arr[j]=arr[j]-l;  
                
           }
         }
       int temp=nonzero(arr,n);
        if(temp!=0)
        printf("%d \n",temp);
        
    }
    
    
    return 0;
}
