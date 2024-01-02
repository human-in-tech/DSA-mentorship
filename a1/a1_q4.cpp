// You've to print all prime numbers between a range
#include<iostream>
using namespace std;
int main(){
    // declaring variables to be used
    int low,high;
    // taking inputs
    cout<<"Input min:";
    cin>>low;
    cout<<"Input max:";
    cin>>high;
    // running the loop for every no. in the range
    for(int i=low;i<=high;i++){
        bool prime=true;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                prime=false;    
                break;
            }
        }
        if(prime==true){
            cout<<i<<endl;
    }}
    return 0;
}