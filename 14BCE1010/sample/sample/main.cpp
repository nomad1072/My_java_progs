//
//  main.cpp
//  sample
//
//  Created by LANKA SAI SIDDHARTH on 4/7/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string.h>
using namespace std;

int calculateLength(char a[])
{
    int counter=0;
    for(int i=0;a[i]!='\0';i++)
    {
        counter++;
    }
    return counter;
    
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char a[100];
    int n;
    for(int i=1;i<n;i++)
    {
        cin>>a;
        int m=0;
        int z=calculateLength(a);
        for(int j=0;j<z/2;j++)
        {
            m+=(int)(a[z-j-1]-a[j]);
        }
        cout<<m;
    }
    return 0;
}