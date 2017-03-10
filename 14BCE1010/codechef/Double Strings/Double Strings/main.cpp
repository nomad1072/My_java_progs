//
//  main.cpp
//  Double Strings
//
//  Created by LANKA SAI SIDDHARTH on 11/10/15.
//  Copyright © 2015 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>

using namespace std;
int doubleString(int);
int fact(int);
void fast_input()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);
}


int main(int argc, const char * argv[]) {
    fast_input();
    int n,s;
    cin>>n;
    while(n!=0)
    {
        int c=0;
        cin>>s;
        c=doubleString(s);
        cout<<c<<endl;
        n--;
    }
   
    return 0;
}
int doubleString(int s)
{
    if(s==2)
    {
        return 2;
    }
    else
    {
        return fact(s/2)+doubleString(s-2);
    }
}
int fact(int s)
{
    if(s==0 || s==1)
    {
        return 1;
    }
    else
    {
        return s*fact(s-1);
    }
    
}
