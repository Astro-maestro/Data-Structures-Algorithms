/* Author Name - Akash Sarkar 
   Date - 08.07.22
   Pattern Type - 1111...
                  2222...
                  3333...
                  .......
*/                  

#include<iostream>
#include<bits/stdc++.h>
using namespace std;
    
int main(){
    int n;
    cin>>n;
    int i = 1;
    while(i<=n){
        int j = 1;
        while(j<=n){
            cout<<i;
            j++;
        }
        cout<<endl;
        i++;
    }
    return 0;
}
