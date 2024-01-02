// print the inverse of a number
#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int n,ld;
    int sum=0,a=1;
    cout<<"enter number:";
    cin>>n;
    // first we find the number of digs of n 
    while(n>0){
        ld=n%10;
        sum+=a*pow(10,ld-1);
        a++;
        n/=10;
    }
    cout<<"The inverse of the number is"<<sum;
    
}