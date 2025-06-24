{\rtf1\ansi\ansicpg1252\cocoartf2856
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-Bold;}
{\colortbl;\red255\green255\blue255;\red129\green95\blue3;\red255\green255\blue255;\red0\green0\blue0;
\red0\green0\blue0;}
{\*\expandedcolortbl;;\csgenericrgb\c50580\c37140\c1210;\csgenericrgb\c100000\c100000\c100000;\csgenericrgb\c0\c0\c0\c85000;
\csgenericrgb\c0\c0\c0\c70000;}
\margl1440\margr1440\vieww14920\viewh17480\viewkind0
\deftab593
\pard\tx593\pardeftab593\pardirnatural\partightenfactor0

\f0\fs36 \cf2 \cb3 #\cf4  Sorted Integer List Program  
\fs24 \
\cf2 ###\cf4  Module 4 - Assignment 01\
\

\fs30 \cf2 ##\cf4  1. Description
\fs24 \
\
This program demonstrates the Java Collections Framework using \cf2 `\cf5 Stack\cf2 `\cf4  to store a series of integers entered by the user. Rather than sorting all values at the end, the program maintains the list in \cf2 **
\f1\b \cf4 sorted ascending order
\f0\b0 \cf2 **\cf4  as numbers are inserted.\
\

\fs30 \cf2 ##\cf4  2. Features
\fs24 \
\
\cf2 - \cf4 Reads integer input from the console.\
\cf2 - \cf4 Stores numbers in a \cf2 `\cf5 Stack<Integer>\cf2 `\cf4 .\
\cf2 - \cf4 Maintains sorted order during insertion (no need for full sort at end).\
\cf2 - \cf4 Handles invalid input (non-integer entries) gracefully.\
\cf2 - \cf4 Terminates when the user enters \cf2 `\cf5 'q'\cf2 `\cf4 .\
\

\fs30 \cf2 ##\cf4  3. Java Collections Used
\fs24 \
\
\cf2 - 
\f1\b \cf4 **
\f0\b0 \cf2 `
\f1\b \cf4 java.util.Stack`
\f0\b0 \cf2 **\cf4  \'96 Stores the integers as they're entered.\
\cf2 - 
\f1\b \cf4 **
\f0\b0 \cf2 `
\f1\b \cf4 java.util.Scanner`
\f0\b0 \cf2 **\cf4  \'96 Captures user input from the console.\
\

\fs30 \cf2 ##\cf4  4. Method-Level Reuse
\fs24 \
\
The \cf2 `\cf5 insertSorted()\cf2 `\cf4  method encapsulates the logic for inserting elements in a sorted order. This allows the sorting mechanism to be reused cleanly throughout the program if needed.\
\

\fs30 \cf2 ##\cf4  5. UML Diagram
\fs24 \
\
A UML class diagram is provided in the file \cf2 `\cf5 diagram.pdf\cf2 `\cf4 .\
\
\pard\tx593\pardeftab593\pardirnatural\partightenfactor0

\fs30 \cf2 ##\cf4  5. Version
\fs24 \
\
A UML class diagram is provided in the file \cf2 `\cf5 diagram.pdf\cf2 `\cf4 .\
\pard\tx593\pardeftab593\pardirnatural\partightenfactor0
\cf4 \

\fs30 \cf2 ##\cf4  6. How to Compile and Run
\fs24 \
\
Make sure you're in the directory containing \cf2 `\cf5 SortedList.java\cf2 `\cf4 , then run the following commands in the terminal:\
\
\cf2 ###\cf4  To compile:\
\
\cf5 ```bash\cf4 \
\cf5 javac SortedList.java\cf4 \
\cf5 ```\cf4 \
\
\cf2 ###\cf4  To Run:\
\cf5 ```bash\cf4 \
\cf5 java SortedList\cf4 \
\cf5 ```\cf4 \
\
\cf2 ###\cf4  To generate Javadoc:\
\cf5 ```bash\cf4 \
\cf5 javadoc SortedList.java\cf4 \
\cf5 ```\cf4 \
}