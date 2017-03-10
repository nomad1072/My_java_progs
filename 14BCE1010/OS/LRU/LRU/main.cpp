//
//  main.cpp
//  LRU
//
//  Created by LANKA SAI SIDDHARTH on 5/1/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int input[15],frame[3]={-1,-1,-1},frame1[3];
    for(int i=0;i<15;i++)
    {
        cin>>input[i];
    }
    for(int i=0;i<15;i++)
    {
        int x=0;
        for(int k=0;k<3;k++)
        {
            if(input[i]==frame[k])
            {
                x=1;break;
            }
            if(frame[k]<0)
            {
                x=1;
                frame[k]=input[i];
                break;
            }
        }
        if(x==0)
        {
            int count=0,small;
            for(int m=i-1;m>=0;m--)
            {
                if(count<3)
                {
                  for(int k=0;k<3;k++)
                  {
                    if(input[m]==frame[k])
                    {
                        frame1[k]=m;count++;
                    }
                  }
                }
            }
            small=0;
            for(int k=0;k<3;k++)
            {
                if(frame[k]<frame[small])
                {
                    small=k;
                }
            }
            frame[small]=input[i];
        }
        for(int k=0;k<3;k++)
        {
            cout<<frame[k]<<" ";
        }
        cout<<endl;
    }
    return 0;
}
