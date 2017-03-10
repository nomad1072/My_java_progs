//
//  main.cpp
//  Priority
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n,bt[10],p[10];
    cout<<"\n Enter the number of processes:\n";
    cin>>n;
    cout<<"\n Enter the burst time and priority for each process:\n";
    for(int i=0;i<n;i++)
    {
        cin>>bt[i]>>p[i];
    }
    for(int i=0;i<n;i++)
    {
        int pos=i;
        for(int j=i+1;j<n;j++)
        {
            if(p[j]<p[pos])
            {
                pos=j;
            }
        }
        int temp;
        temp=p[pos];
        p[pos]=p[i];
        p[i]=temp;
        temp=bt[pos];
        bt[pos]=bt[i];
        bt[i]=temp;
        
    }
    cout<<"Priority:\n";
    for(int i=0;i<n;i++)
    {
        cout<<p[i]<<"\t"<<bt[i]<<endl;
    }
    return 0;
}
