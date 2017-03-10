//
//  main.cpp
//  FIFO
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include<iostream>
using namespace std;
int main()
{
    int j,n,a[50],frame[10],no,avail,count=0;
    cout<<"\n Enter the number of pages:\n";
    cin>>n;
    cout<<"\n Enter the page number:\n";
    for(int i=1;i<=n;i++)
    {
        cin>>a[i];
    }
    cout<<"\n Enter the number of frames:";
    cin>>no;
    for(int i=0;i<no;i++)
    {
        frame[i]=-1;
    }
    j=0;
    cout<<"ref string\t page frames\n";
    for(int i=1;i<=n;i++)
    {
        cout<<a[i];
        avail=0;
        for(int k=0;k<no;k++)
        {
            if(frame[k]==a[i])
                avail=1;
        }
        if(avail==0)
        {
            frame[j]=a[i];
            j=(j+1)%no;
            count++;
            for(int k=0;k<no;k++)
            cout<<"\t\t"<<frame[k];
        }
        cout<<"\n";
        
    }
    cout<<"Page fault is"<<count;
    return 0;
}