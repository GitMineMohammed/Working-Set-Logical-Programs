package org.logicalprograms;

public class Iteration_Number_Fibinocci_Series {

public static void main(String[] args) {

int a = 0; int b = 1; int input = 5;	

for (int i = 0; i < input; i++) {

int c = a+b;
System.out.println(c);
a=b;
b=c; }	

} }