//
//  main.cpp
//  OS lab term end
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;


int main(int argc, const char * argv[]) {
    int n,bt[10],at[10],tat[10],wt[10],btt,awt,atat;
    cout<<"\n Enter the number of processes:\n";
    cin>>n;
    cout<<"\n Enter burst times for each process:\n";
    for(int i=0;i<n;i++)
    {
        cin>>bt[i];
    }
    cout<<"\n ENter arrival times for each process:\n";
    for(int i=0;i<n;i++)
    {
        cin>>at[i];
    }
    wt[0]=0;
    atat=tat[0]=bt[0];
    btt=bt[0];//to store total burst time sum
    
    for(int i=1;i<n;i++){
        wt[i]=btt-at[i];
        btt+=bt[i];
        awt+=wt[i];
        tat[i]= wt[i]+bt[i];
        atat+=tat[i];
    }
    atat/=n;
    awt/=n;
    
        int i;
        cout<<"SR.\tA.T.\tB.T.\tW.T.\tT.A.T.\n";
        for(i=0;i<n;i++)
        {
            cout<<i+1<<"\t\t"<<at[i]<<"\t\t"<<bt[i]<<"\t\t"<<wt[i]<<"\t\t"<<tat[i]<<endl;
        }
        cout<<"Average Waiting Time:"<<awt<<"\nAverage Turn Around Time:"<<atat;
    
    
    
    return 0;
}
