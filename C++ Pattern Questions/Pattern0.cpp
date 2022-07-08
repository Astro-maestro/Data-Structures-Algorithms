/* Author - Akash Sarkar 
   Date - 08.07.22 
   Pattern Type - Square Pattern */


#include<iostream>
#include<bits/stdc++.h>
using namespace std;

    
int main(){
    int n;
    cin>>n;
    int row = 1;
    while(row<=n){
        int col =1;
        while(col<=row){
            cout<< "*";
            col++;
        }
        cout<<endl;
        row++;
    }
    return 0;
}
