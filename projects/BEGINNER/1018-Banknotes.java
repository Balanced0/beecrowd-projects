{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.io.IOException;\
import java.util.Scanner;\
 \
/**\
 * IMPORTANT: \
 *      O nome da classe deve ser "Main" para que a sua solu\'e7\'e3o execute\
 *      Class name must be "Main" for your solution to execute\
 *      El nombre de la clase debe ser "Main" para que su soluci\'f3n ejecutar\
 */\
public class Main \{\
 \
    public static void main(String[] args) throws IOException \{\
 \
        /**\
         * Escreva a sua solu\'e7\'e3o aqui\
         * Code your solution here\
         * Escriba su soluci\'f3n aqu\'ed\
         */\
         Scanner sc = new Scanner(System.in);\
         int N = sc.nextInt();\
         int hundred = N/100;\
         int remaining1 = N%100;\
         int fifty = remaining1/50;\
         int remaining2 = remaining1%50;\
         int twenty = remaining2/20;\
         int remaining3 = remaining2%20;\
         int ten = remaining3/10;\
         int remaining4 = remaining3%10;\
         int five = remaining4/5;\
         int remaining5 = remaining4%5;\
         int two = remaining5/2;\
         int remaining6 = remaining5%2;\
         int one = remaining6/1;\
         System.out.println(N);\
         System.out.println(hundred + " nota(s) de R$ 100,00");\
         System.out.println(fifty + " nota(s) de R$ 50,00");\
         System.out.println(twenty + " nota(s) de R$ 20,00");\
         System.out.println(ten + " nota(s) de R$ 10,00");\
         System.out.println(five + " nota(s) de R$ 5,00");\
         System.out.println(two + " nota(s) de R$ 2,00");\
         System.out.println(one + " nota(s) de R$ 1,00");\
 \
    \}\
 \
\}}