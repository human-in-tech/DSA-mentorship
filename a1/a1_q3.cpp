// You've to check whether a given number is prime or not.
#include<iostream>
using namespace std;
int main(){
    int t;
    bool prime=true;
    cout<<"How many numbers do you wish to print:";
    cin>>t;
    for (int i=0;i<t;i++){
        int n;
        cout<<"input your number:";
        cin>>n;
        if (n==2){
            prime=false;
        }
        for (int j=2;j<=n/2;j++){
            if (n%j==0){
                prime=false;
                break;
            }
        }
    if (prime){
        cout<<n<<": prime"<<endl;
    }
    else{
        cout<<n<<": not prime"<<endl;
    }
}}