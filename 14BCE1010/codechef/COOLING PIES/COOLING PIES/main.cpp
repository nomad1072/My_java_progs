//
//  main.cpp
//  COOLING PIES
//
//  Created by LANKA SAI SIDDHARTH on 11/10/15.
//  Copyright © 2015 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    
    int *a,*b;
    
    cin>>n;
    while(n!=0)
    {
        int p=0;
        cin>>p;
        a=new int[p];
        b=new int[p];
        for(int i=0;i<p;i++)
        {
            cin>>a[i];
        }
        for(int i=0;i<p;i++)
        {
            cin>>b[i];
        }
        int lar=0;
        int k=0;
        int co=0;
        
       
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<p;j++)
            {
                if(a[j]>lar && a[j]<=b[i])
                {
                    a[j]=0;
                    co++;
                    k++;
                }
            }
        }
        cout<<co;
        n--;
    }
    return 0;
}
