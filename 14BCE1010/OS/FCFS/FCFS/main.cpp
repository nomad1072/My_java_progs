//
//  main.cpp
//  FCFS
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    int bt[10],bt1[10],wt[10];
    cout<<"\n Enter the number of processes:\n";
    cin>>n;
    cout<<"\n Enter burst times for each process:\n";
    for(int i=0;i<n;i++)
    {
        cin>>bt[i];
    }
    bt1[0]=bt[0];
    wt[0]=0;
    for(int i=1;i<n;i++)
    {
        bt1[i]=bt[i]+bt1[i-1];
        wt[i]=bt1[i-1];
    }
    cout<<"\t Burst time  \t Wait time:"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<"\t"<<bt1[i]<<"\t\t\t"<<wt[i]<<endl;
    }
    return 0;
}
