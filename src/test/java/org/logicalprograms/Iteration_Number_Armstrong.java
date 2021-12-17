package org.logicalprograms;

public class Iteration_Number_Armstrong {

public static void main(String[] args) {
	
int inputRemainder = 0;
int result = 0; 
int input = 123; 
int armNo = input;  

while(input>0) {

inputRemainder=input%10;
result=result+(inputRemainder*inputRemainder*inputRemainder);
input=input/10; }
System.out.println(result);

if (armNo==result) {
System.out.println("The given Input is Armstrong");	}
else { System.out.println("The given Input is Armstrong");} 

} }
