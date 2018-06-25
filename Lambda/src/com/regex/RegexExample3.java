package com.regex;
import java.util.regex.*;  
class RegexExample3{  
public static void main(String args[]){  
System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
System.out.println(Pattern.matches("[amn]", "m"));//true (among a or m or n)  
System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
System.out.println(Pattern.matches("[amn]", "mn"));//false (m and n comes more than once)
}}  