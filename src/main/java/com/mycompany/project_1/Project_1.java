/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


//

int []arr = {1,2,3,4,5,6,10,11,12,13,14,15};
     boolean[]sieve=bolean[n+1];
    
    int p = 2;
    for(p = 2;p < n2;p++)
    for(inti = p*p; i<n;i=i+p)
{
sieve[i]=true;
        
        if(arr[i] <= arr[i+1])
            break;
     }
    
    if(i == arr.length-1)
    {
     System.out.print( "Массив упорядочен  ");
      
    }
    else
    {
    
    System.out.print( "Массив неупорядочен ");
    }




package com.mycompany.project_1;



import java.util.Scanner;
    //
/**
 *
 * @author Student
 */
public class Project_1 {

    public static void main(String[] args) 
    
 int[][]Mx = {{1,-1,-1},     
            {1,1,-1,-1},
            {1,1,1,-1},
            {1,1,1,1}},
            
     int sum = 0;       
     int row Mx.length;     
     int column = Mx [0]. length;
        
        for(int i = 0;i<row;i++)
        { for(int j = 0;j<=i;j++)
        {sum = sum + Mx[i][j];  
        }  
    {
        
      System.out.print( "Сумма равна = " + sum);  
        
        
        
        
        
        
//  public class Test{ 

   public static void main(String args[]){
      int a = 0; // Начальное значение диапазона - "от"
      int b = 10; // Конечное значение диапазона - "до"
      
      int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
      System.out.println("0 " + random_number1);
      
      int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
      System.out.println("2-ое: " + random_number2);
     
      int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
      System.out.println("3-е случайное число: " + random_number3);
   }
}
        
        
        
        
        
        
        
//   
int []arr = {10,81,7,5,4,3,2,1};
    boolean flag = true;
    
    int i1 = 0;
    int i2 = 0;
    for(i=0; 1<arr.length-1; i++)
    {
        
        if(arr[i] >= arr[i+1])
            i1=1;
     }
    if(arr[i] <= arr[i+1]
            i2=1;
    if(i == arr.length-1)
        if(i1==i2);
    {
     System.out.print( "Массив упорядочен  ");
      
    }
    else
    {
    
    System.out.print( "Массив неупорядочен "); 
//    int c=5;
//    int b=6; 
//    Scanner myScnr = new Scanner(System.in);
//    System.out.print("Input value A = ");
//    dataA = myScnr.nextInt();
//    
//    a = myScnr.nextInt();
//    
//    
//    b = myScnr.nextInt(); 
//    c = myScnr.nextInt(); 
//    if((dataA >= 100) && (dataA<=999))
//        }//
//    
//    
//    
//    
//    
    }
}


    }



//        
//        byte val=1;
//        
//        
//        
//        System.out.println("Hello World!");
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input name: ");
//        String name = in.nextLine();
//        System.out.print("Input age: ");
//        int age = in.nextInt();
//        System.out.print("Input height: ");
//        float height = in.nextFloat();
//        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//        in.close();