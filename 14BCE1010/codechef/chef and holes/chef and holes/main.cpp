//
//  main.cpp
//  chef and holes
//
//  Created by LANKA SAI SIDDHARTH on 11/9/15.
//  Copyright © 2015 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
   
    int n;
    string s;
    cin>>n;
    while(n!=0)
    {
        cin>>s;
        int i=0,c = 0;

        while(s[i]!='\0')
        {
           if(s[i]=='A' || s[i]=='D' || s[i]=='P' || s[i]=='R' || s[i]=='O' || s[i]=='Q')
           {
               c++;
              // cout<<c<<endl;
           }
           else if(s[i]=='B')
           {
                c=c+2;
           }
            
            i++;
        }
        cout<<c<<endl;
        
        n--;
    }
    return 0;
}
