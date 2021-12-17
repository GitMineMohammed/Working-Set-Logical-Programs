

package org.logicalprograms;

public class Iteration_String_Charater_Type_Count {

public static void main(String[] args) {	

String input = "TataConsultancyServices@1234.";

int lowercase = 0; int uppercase = 0; int numbers = 0; int splCharacter = 0;

for (int i = 0; i<input.length(); i++) {
char charAt = input.charAt(i);	

if (charAt>='a' && charAt<='z') {lowercase++;}
else if (charAt>='A' && charAt<='Z') {uppercase++;}
else if (charAt>='0' && charAt<='9') {numbers++;}
else {splCharacter++;} }

System.out.println("Count of Lowercase : "+lowercase);
System.out.println("Count of Uppercase : "+uppercase);
System.out.println("Count of Numbers : "+numbers);
System.out.println("Count of Special Characters : "+splCharacter);

} }