//
//  main.cpp
//  Round Robin
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n,bt[10],a[10],q,wt[10],tat[10];int sum;
    cout<<"\n Enter number of processes:\n";
    cin>>n;
    cout<<"\n Enter burst times for each process:\n";
    for(int i=0;i<n;i++)
    {
        cin>>bt[i];
        a[i]=bt[i];
    }
    for(int i=0;i<n;i++)
        wt[i]=0;
    cout<<"\n Enter time quantum:\n";
    cin>>q;
    do {
        for(int i=0;i<n;i++)
        {
            if(bt[i]>q)
            {
                bt[i]-=q;
                for(int j=0;j<n;j++)
                {
                    if(j!=i && bt[j]!=0)
                    {
                        wt[j]+=q;
                    }
                }
            }
            else
            {
                for(int j=0;j<n;j++)
                {
                    if(j!=i && bt[j]!=0)
                    {
                        wt[j]+=bt[i];
                    }
                }
                bt[i]=0;
            }
          
        }
        sum=0;
        for(int k=0;k<n;k++)
        {
            sum=sum+bt[k];
        }

        
    }while(sum!=0);
    for(int i=0;i<n;i++)
        tat[i]=wt[i]+a[i];
    cout<<"  BT   WT  TAT"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<"\t"<<a[i]<<"\t"<<wt[i]<<"\t"<<tat[i]<<endl;
    }
    return 0;
}
