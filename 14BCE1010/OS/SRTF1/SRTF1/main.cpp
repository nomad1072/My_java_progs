//
//  main.cpp
//  SRTF1
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int bt[10],at[10],rt[10],n,time,remain=0,smallest,endTime,sum_wait=0,sum_tt=0;
    cout<<"\n Enter the number of processes:\n ";
    cin>>n;
    cout<<"\n Enter the burst time and arrival time:\n";
    for(int i=0;i<n;i++)
    {
        cin>>bt[i]>>at[i];
        rt[i]=bt[i];
    }
    cout<<"Process\t Turnaroundtime\t Waiting Time"<<endl;
    rt[9]=9999;
    for(time=0;remain!=n;time++)
    {
        smallest=9;
        for(int i=0;i<n;i++)
        {
            if(at[i]<=time && rt[i]<rt[smallest] && rt[i]>0)
            {
                smallest=i;
            }
        }
        rt[smallest]--;
        if(rt[smallest]==0)
        {
            remain++;
            endTime=time+1;
            cout<<smallest+1<<"\t\t"<<endTime-at[smallest]<<"\t\t"<<endTime-at[smallest]-bt[smallest]<<endl;
            sum_tt+=endTime-at[smallest];
            sum_wait+=endTime-at[smallest]-bt[smallest];
            
        }
    }
    
    return 0;
}
