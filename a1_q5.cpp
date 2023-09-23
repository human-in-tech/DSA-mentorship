// you've the count the number of digits in a number
#include<iostream>
using namespace std;
int main(){
    int n,d;
    d=0;
    cout<<"Enter the number:";
    cin>>n;
    while(n>0){
        n/=10;
        d++;
    }
    cout<<"the number of digits in the number are "<<d;
}