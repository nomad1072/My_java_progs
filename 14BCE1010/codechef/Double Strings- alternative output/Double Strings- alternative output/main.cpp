//
//  main.cpp
//  Double Strings- alternative output
//
//  Created by LANKA SAI SIDDHARTH on 11/10/15.
//  Copyright © 2015 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n,a[100000],s;
    cin>>n;
    for (int i=0;i<n;i++)
    {
        cin>>s;
        if (s%2 == 0)
            a[i]=s;
        else
            a[i]=s-1;
    }
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<endl;
    }
    return 0;
}
