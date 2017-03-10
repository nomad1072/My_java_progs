//
//  main.cpp
//  NUMGAME
//
//  Created by LANKA SAI SIDDHARTH on 11/10/15.
//  Copyright © 2015 LANKA SAI SIDDHARTH. All rights reserved.
//

#include <iostream>
using namespace std;


int main(int argc, const char * argv[]) {
    int n;
    cin>>n;
    while(n!=0)
    {
        int s=0;
        cin>>s;
        if(s%2==0)
        {
            cout<<"ALICE"<<endl;
        }
        else
        {
            cout<<"BOB"<<endl;

        }
        
        n--;
    }
    
    return 0;
}
