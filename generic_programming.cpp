#include<iostream>
using namespace std;
template<class T>
void swap_num(T x,T y){
   T temp;
   temp=x;
   x=y;
   y=temp;
   cout<<"\n"<<"The numbers after swapping are:"<<"\n";
   cout<<x<<"\t"<<y;
}

template<class T>
void bubbleSort(T arr1[20],int n){
    T temp;
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr1[j]>arr1[j+1]){
                temp=arr1[j];
                arr1[j]=arr1[j+1];
                arr1[j+1]=temp;
            }
        }
    }
}
int main(){
    int num1,num2,n,arr1[20];
    double n1,n2,arr2[20];
    cout<<"\n"<<"Enter the numbers you want to swap:"<<"\n";
    cin>>num1;
    cin>>num2;
    swap_num<int>(num1,num2);
    cout<<"\n"<<"Enter the numbers you want to swap:"<<"\n";
    cin>>n1;
    cin>>n2;
    swap_num<double>(n1,n2);
    

    cout<<"\n"<<"Enter the size of array:"<<"\n";
    cin>>n;
    cout<<"\n"<<"Enter the elements of array:"<<"\n";
    for(int i=0;i<n;i++){
        cin>>arr1[i];
    }
    cout<<"\n"<<"The elements of array are::"<<"\n";
    for(int i=0;i<n;i++){
        cout<<arr1[i]<<"\t";
    }
    bubbleSort(arr1,n);
    cout<<"\n"<<"The elements of array after sorting are::"<<"\n";
    for(int i=0;i<n;i++){
        cout<<arr1[i]<<"\t";
    }


    cout<<"\n"<<"Enter the size of array:"<<"\n";
    cin>>n;
    cout<<"\n"<<"Enter the elements of array:"<<"\n";
    for(int i=0;i<n;i++){
        cin>>arr2[i];
    }
    cout<<"\n"<<"The elements of array are::"<<"\n";
    for(int i=0;i<n;i++){
        cout<<arr2[i]<<"\t";
    }
    bubbleSort(arr2,n);
    cout<<"\n"<<"The elements of array after sorting are::"<<"\n";
    for(int i=0;i<n;i++){
        cout<<arr2[i]<<"\t";
    }
}
