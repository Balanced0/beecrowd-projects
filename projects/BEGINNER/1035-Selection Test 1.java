{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.io.IOException;\
import java.util.Scanner;\
 \
public class Main \{\
 \
    public static void main(String[] args) throws IOException \{\
        Scanner sc = new Scanner(System.in);\
        \
        int A = sc.nextInt();\
        int B = sc.nextInt();\
        int C = sc.nextInt();\
        int D = sc.nextInt();\
        \
        int sumCD = C + D; // Correctly declared sumCD\
        int sumAB = A + B; // Correctly declared sumAB\
        \
        if (B > C && D > A && sumCD > sumAB && A % 2 == 0 && C > 0 && D > 0) \{\
            System.out.println("Valores aceitos");\
        \} else \{\
            System.out.println("Valores nao aceitos");\
        \}\
 \
        sc.close();\
    \}\
\}}