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
        double N = sc.nextDouble();\
        \
        // Convert N to cents (integer value)\
        int cents = (int) (N * 100);\
        \
        // Calculate number of notes\
        int hundred = cents / 10000;\
        cents %= 10000;\
        int fifty = cents / 5000;\
        cents %= 5000;\
        int twenty = cents / 2000;\
        cents %= 2000;\
        int ten = cents / 1000;\
        cents %= 1000;\
        int five = cents / 500;\
        cents %= 500;\
        int two = cents / 200;\
        cents %= 200;\
        \
        // Calculate number of coins\
        int one = cents / 100;\
        cents %= 100;\
        int half = cents / 50;\
        cents %= 50;\
        int quarter = cents / 25;\
        cents %= 25;\
        int dime = cents / 10;\
        cents %= 10;\
        int nickel = cents / 5;\
        cents %= 5;\
        int penny = cents;\
        \
        // Print the result\
        System.out.println("NOTAS:");\
        System.out.printf("%d nota(s) de R$ 100.00\\n", hundred);\
        System.out.printf("%d nota(s) de R$ 50.00\\n", fifty);\
        System.out.printf("%d nota(s) de R$ 20.00\\n", twenty);\
        System.out.printf("%d nota(s) de R$ 10.00\\n", ten);\
        System.out.printf("%d nota(s) de R$ 5.00\\n", five);\
        System.out.printf("%d nota(s) de R$ 2.00\\n", two);\
        \
        System.out.println("MOEDAS:");\
        System.out.printf("%d moeda(s) de R$ 1.00\\n", one);\
        System.out.printf("%d moeda(s) de R$ 0.50\\n", half);\
        System.out.printf("%d moeda(s) de R$ 0.25\\n", quarter);\
        System.out.printf("%d moeda(s) de R$ 0.10\\n", dime);\
        System.out.printf("%d moeda(s) de R$ 0.05\\n", nickel);\
        System.out.printf("%d moeda(s) de R$ 0.01\\n", penny);\
\
        sc.close();\
    \}\
\}}