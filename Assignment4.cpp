#include<iostream>
using namespace std;
class feet_inch;
class metre_cm;
class metre_cm{
private:
double metre;
double centimetre;

public:
void getdata(double m,double cm);
void display();
friend feet_inch add(feet_inch x,metre_cm y);
friend metre_cm add(metre_cm x,feet_inch y);
friend feet_inch sub(feet_inch x,metre_cm y);
friend metre_cm sub(metre_cm x,feet_inch y);
};

class feet_inch{
private:
double feet;
double inch;

public:
void getdata(double ft,double i);
void display();
friend feet_inch add(feet_inch x,metre_cm y);
friend metre_cm add(metre_cm x,feet_inch y);
friend feet_inch sub(feet_inch x,metre_cm y);
friend metre_cm sub(metre_cm x,feet_inch y);
};

void metre_cm::getdata(double m,double cm){
metre=m;
centimetre=cm;
}

void metre_cm::display(){
cout<<"The answer is:"<<"\n"<<metre<<"metres"<<"\t"<<centimetre<<"centimetre";
}

feet_inch add(feet_inch x,metre_cm y){
double result;
feet_inch temp;
result=x.feet*12+x.inch+y.metre*39.3701+y.centimetre*0.393701;
int answer=result; //answer in inches
temp.feet=answer/12;
temp.inch=answer%12;
//temp.feet=x.feet+(y.metre*3.28084);
//temp.inch=x.inch+(y.centimetre*0.393701);
return temp;
}

/*class feet_inch{
private:
double feet;
double inch;

public:

void getdata(double ft,double i);
void display();
friend feet_inch add1(feet_inch x,metre_cm y);
friend metre_cm add2(metre_cm x,feet_inch y);
};*/

void feet_inch::getdata(double ft,double i){
feet=ft;
inch=i;
}

void feet_inch::display(){
cout<<"The answer is:"<<"\n"<<feet<<"feet"<<"\t"<<inch<<"inch";
}

metre_cm add(metre_cm x,feet_inch y){
metre_cm temp;
double result;
result=y.feet*30.48+y.inch*2.54+x.metre*100+x.centimetre;
int answer = result; //typecasted double to int //answer in cm
temp.metre=answer/100;
temp.centimetre=answer%100;
//temp.metre=x.metre+(y.feet*0.3048);
//temp.centimetre=x.centimetre+(y.inch*2.54);
return temp;
}

feet_inch sub(feet_inch x,metre_cm y){
    feet_inch temp;
    double result;
    result=(x.feet*12+x.inch)-(y.metre*39.3701+y.centimetre*0.393701);
    if(result<0){
        result=-(result);
    }
    int answer=result;
    temp.feet=answer/12;
    temp.inch=answer%12;
    return temp;
}

metre_cm sub(metre_cm x,feet_inch y){
    metre_cm temp;
    double result;
    result=(x.metre*100+x.centimetre)-(y.feet*30.48+y.inch*2.54);
    if(result<0){
        result=-(result);
    }
    int answer=result;
    temp.metre=answer/100;
    temp.centimetre=answer%100;
    return temp;
}

int main(){
int choice,op;
double m,cm,ft,i;

feet_inch f1,f2;
metre_cm m1,m2;
do{cout<<"Enter the dimensions in metre:"<<"\n";
cin>>m;
cout<<"Enter the dimensions in centimetre:"<<"\n";
cin>>cm;
m1.getdata(m,cm);
cout<<"Enter the dimensions in feet:"<<"\n";
cin>>ft;
cout<<"Enter the dimensions in inches:"<<"\n";
cin>>i;
f1.getdata(ft,i);
cout<<"Choose from the dropdown below:"<<"\n";
cout<<"1.Addition and conversion from feet_inches to metre_cm"<<"\n";
cout<<"2.Addition and conversion from metre_cm to feet_inches"<<"\n";
cout<<"3.Subtraction and conversion from feet_inches to metre_cm"<<"\n";
cout<<"4.Subtraction and conversion from metre_cm to feet_inches"<<"\n";
cin>>choice;
switch(choice){
case 1:
m2=add(m1,f1);
m2.display();
break;

case 2:
f2=add(f1,m1);
f2.display();
break;

case 3:
m2=sub(m1,f1);
m2.display();
break;

case 4:
f2=sub(f1,m1);
f2.display();
break;
}
cout<<"\nDo you want to continue(Yes=1:No=0):"<<"\n";
cin>>op;
}while(op==1);
return 0;
}