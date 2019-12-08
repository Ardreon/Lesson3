package com.lessons;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	double sum = 0;
    	Shape[] array = new Shape[10];



		array[0] = new Rectangle("RED", 10, 4);
		array[1] = new Circle("YELLOW", 6);
		array[2] = new Triangle("BLACK", 4.5, 6, 4);
		array[3] = new Circle("BlUE", 4);
		array[4] = new Rectangle("YELLOW", 6, 14);
		array[5] = new Triangle("GREEN", 5, 6, 7);
		array[6] = new Rectangle("BLACK", 8, 2);
		array[7] = new Circle("GREY", 15);
		array[8] = new Triangle("BROWN", 10, 12, 15);
		array[9] = new Rectangle("YELLOW", 6, 14);


		//Вывод по увеличеню пощади
		Arrays.sort(array, new ComparatorSIncrease());
		System.out.println(" Вывод по увеличеню пощади ");
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i] + " " + "area = " + array[i].calcArea());
			sum = sum + array[i].calcArea();
		}

		System.out.println(" ");

		//Вывод по цвету
		System.out.println(" Вывод по цвету ");
		Arrays.sort(array, new ComparatorColorIncrease());
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i] + " " + "area = " + array[i].calcArea());
		}


		//Вычисляет общую площадь
		System.out.println(" ");
		System.out.println("Общая площадь фигур: " + sum);



    }


}
