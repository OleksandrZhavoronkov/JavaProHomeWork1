package com.example.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
JavaProHomeWork1
1. Поприветствовать любого пользователя при вводе его имени через аргумент командной строки.
2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
3. Объявить массив с n-м количеством случайных чисел (используя инициализатор массива) и вывести числа массива
один раз с переходом(столбец) и один раз без перехода на новую строку(строка).
*/

public class Main extends TextOutputs{
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Task 1
        TextOutputs.Lines();//get text fom the TextOutputs class
        TextOutputs.Greetings();//get text fom the TextOutputs class
        String userName = READER.readLine();//assign user input to the variable
        System.out.println("Hello, " + userName);//greeting user using data he entered
        TextOutputs.Lines();//get text fom the TextOutputs class
        TextOutputs.emptyLine();//get text fom the TextOutputs class

        //Task 2
        TextOutputs.Lines();//get text fom the TextOutputs class
        TextOutputs.enterData();//get text fom the TextOutputs class
        String userInput = READER.readLine();//assign user input to the variable
        String userInputReversed = new StringBuffer(userInput).reverse().toString();//Reversing user input
        System.out.println("Your input, but in reversed way - " + userInputReversed);//Printing reversed user input
        TextOutputs.Lines();//get text fom the TextOutputs class
        TextOutputs.emptyLine();//get text fom the TextOutputs class

        //Task 3
        TextOutputs.Lines();//get text fom the TextOutputs class
        TextOutputs.arraySizeFromUser();
        int arraySize = Integer.parseInt(READER.readLine());//get array size from the user
        int[] userArray = new int[arraySize];//creating an array with the size provided from the user
        fill(userArray);//calling method to fill the array in

        //print the array in a column perspective
        TextOutputs.columnView();
        for (int i = 0; i < userArray.length; i++ ) {
            System.out.println(userArray[i]);
        }

        TextOutputs.emptyLine();//get text fom the TextOutputs class
        TextOutputs.rawView();
        System.out.println(Arrays.toString(userArray));//print the array from a raw perspective
        TextOutputs.Lines();//get text fom the TextOutputs class
    }

    //Static method to fill the array in with random digits from 0-9, used FOR and Math.random()
    public static void fill(int[] UserArray) {
        for (int i = 0; i < UserArray.length; i++) {
            UserArray[i] = (int) (Math.random() * 9);
        }
    }
}