
package org.logicalprograms;

public class Iteration_String_Reverse_Characters {

public static void main(String[] args) {

String input = "java"; //-> length = 4
String output =""; //-> Empty without space

for (int i = input.length()-1; i >= 0; i--) { //length starts from 0 to n
char charAt = input.charAt(i);
output = output+charAt; }

System.out.println(output); } }