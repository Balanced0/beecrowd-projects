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
         int code1 = sc.nextInt();\
         int unit1 = sc.nextInt();\
         float money1 = sc.nextFloat();\
         int code2 = sc.nextInt();\
         int unit2 = sc.nextInt();\
         float money2 = sc.nextFloat();\
         float total_money = ((unit1 * money1) + (unit2 * money2));\
         String MONEY = String.format("%.2f", total_money);\
         System.out.println("VALOR A PAGAR: R$ " + MONEY);\
 \
    \}\
 \
\}}