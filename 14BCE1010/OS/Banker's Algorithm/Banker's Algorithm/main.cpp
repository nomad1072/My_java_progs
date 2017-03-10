//
//  main.cpp
//  Banker's Algorithm
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;
int main(int argc, const char * argv[]) {
    int max[10][10],alloc[10][10],need[10][10],avail[10],n,process,r,completed[10],safecount[10],count=0;
    cout<<"\n Enter the number of processes:\n";
    cin>>n;
    cout<<"\n Enter the number of resources:\n";
    cin>>r;
    cout<<"\n Enter the allocation matrix elements:\n";
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<r;j++)
        {
            cin>>alloc[i][j];
        }
    }
    cout<<"\n Enter the max matrix elements:\n";
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<r;j++)
        {
            cin>>max[i][j];
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<r;j++)
        {
            need[i][j]=max[i][j]-alloc[i][j];
        }
    }
    cout<<"\n Enter the available resources:\n";
    for(int i=0;i<r;i++)
    {
        cin>>avail[i];
    }
    do
    {
        cout<<"\n Max matrix:\t Allocation matrix:\n";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<r;j++)
            {
                cout<<max[i][j];
            }
            cout<<"\t\t";
            for(int j=0;j<r;j++)
            {
                cout<<alloc[i][j];
            }
            cout<<"\n";
        }
        process=-1;
        for(int i=0;i<n;i++)
        {
            if(completed[i]==0)
            {
                process=i;
                for(int j=0;j<r;j++)
                {
                    if(avail[j]<need[i][j])
                    {
                        process=-1;
                        break;
                    }
                }
            }
            if(process!=-1)
            {
                break;
            }
        }
        if(process!=-1)
        {
            for(int j=0;j<r;j++)
            {
                avail[j]+=alloc[process][j];
                alloc[process][j]=0;
                max[process][j]=0;
                completed[process]=1;
            }
            cout<<"\nprocess runs to completion"<<process+1;
            cout<<"\n New available matrix values:"<<avail[0]<<"\t"<<avail[1]<<"\t"<<avail[2];
            safecount[count]=process+1;
            count++;
            
            
        }
        
    }while(count!=n && process!=-1);
    if(count==n)
    {
        cout<<"\n The system is in a safe state:\n";
        cout<<"\n Safe sequence:<";
        for(int i=0;i<n;i++)
        {
            cout<<safecount[i];
        }
    }
    else
    {
        cout<<"\n Unsafe state";
    }
        
    


    
    return 0;
}
