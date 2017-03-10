//
//  main.cpp
//  quicksort
//
//  Created by LANKA SAI SIDDHARTH on 11/10/15.
//  Copyright © 2015 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;
void quicksort(int a[],int left,int right)
{
    if(left<right)
    {
    int pivot=a[left];
    int i=left+1;
    int temp;
    
    for(int j=left+1;j<right;j++)
    {
        if(a[j]<pivot)
        {
            temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
        }
    }
    temp=a[i-1];
    a[i-1]=a[left];
    a[left]=temp;
    quicksort(a,left,i-1);
    quicksort(a,i+1,right);
    }
}
int main(int argc, const char * argv[]) {
    int a[10];
    int n;
    cout<<"\n Enter number of elements:\n";
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    quicksort(a,0,n);
    cout<<"\n Elements after sorting:\n";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<"\t";
    }
    
    return 0;
}
