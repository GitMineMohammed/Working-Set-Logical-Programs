package org.logicalprograms;

public class Iteration_Odd_And_Even_Number_Count {

public static void main(String[] args) {

int evenNumberCount = 0; 
int oddNumberCount = 0;

for (int i = 0; i <= 100; i++) {

if (i%2==0) {
evenNumberCount=(evenNumberCount+1);}

else {
oddNumberCount=(oddNumberCount+1);} }

System.out.println("Count of Even Number is "+evenNumberCount);
System.out.println("Count of Odd Number is "+oddNumberCount);

}}
