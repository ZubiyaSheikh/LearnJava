//import java.util.Scanner;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

      /* Shapes obj=new Shapes();
        obj.r = 4.2;
        obj.l = 3.2;
        obj.b = 4.2;

        double areaOfCircle =  obj.areaCircle();
        System.out.println("Area of the circle is "+areaOfCircle);
        System.out.println("Area of Rectangle is "+obj.areaRectangle());*/
       /* Person obj = new Person();
        System.out.println("Enter a Name:");
        obj.name = sc.next();
        System.out.println("Enter your age:");
        obj.age = sc.nextFloat();
         obj.introduce();
         */



        /*Lecture_1
        System.out.println("The sum of three numbers:");
        int num1= 5;
        int num2=4;
        int num3=8;
        int sum=num1+num2+num3;
        System.out.println(sum);
        */



        /*Lecture_2 obj=new Lecture_2();
        System.out.println("enter age1");
        obj.age1=sc.nextInt();
        System.out.println("enter age2");
        obj.age2=sc.nextByte();
        //obj.ch=sc.next();
        System.out.println("enter a float");
        obj.f1= sc.nextFloat();
        System.out.println("netr a double");
        obj.d1=sc.nextDouble();
        System.out.println("enter a string2);
        obj.str=sc.next();
        obj.Literls();
        */



        /*Lecture_3
        System.out.println("Taking input from user");
        System.out.println("Enter num1:);
        int a= sc.nextInt();
        System.out.println("Enter num2;");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        */



        /*Lecture_4
        float sub1,sub2,sub3,sub4,sub5;
        float sum;
      ;float percentage;
        System.out.println("Enter marks of sub1");
        sub1= sc.nextFloat();
        System.out.println("Enter marks of sub2");
        sub2= sc.nextFloat();
        System.out.println("Enter marks of sub3");
        sub3= sc.nextFloat();
        System.out.println("Enter marks of sub4");
        sub4= sc.nextFloat();
        System.out.println("Enter marks of sub5");
        sub5= sc.nextFloat();
        sum=sub1+sub2+sub3+sub4+sub5;
        percentage=(sum/500)*100;
        System.out.println(percentage);
        */



        /*Lecture5...Q1
        float sub1=45;
        float sub2=48;
        float sub3=95;
        float cgpa=(sub1+sub2+sub3)/30;
        System.out.println("CGPA is"+cgpa);
        */



        /*Lecture_5...Q2
        System.out.println("What is your name?");
        String name=sc.next();
        System.out.println("Hello "+name+" have a good day!");
         */



        /*Lecture_5...Q3
        System.out.println("Enter a number:");
        System.out.println(sc.hasNextInt());
         */



        /*Lecture_5...q4
        int a=4;
        //int b=6+a;
        //int b=6%a;
        int b=9;
        b+=3;
        System.out.println(b);
        System.out.println(64>6);//comparison operator
        System.out.println(65>6 && 64>8);//logical operator
        System.out.println(2&3);//bitwise operator
        */



        /*Lecture_7
        int a = 6 * 5 - 34 / 2;
        int b =60/5-34*2;
        System.out.println(a);
        System.out.println(b); */



        /*Lecture_8
        byte x=5;
        int y=6;
        short z=8;
        int a=y+z;
        float b=6.54f+x;
        System.out.println(a);
        System.out.println(b);
        int y=7;
        int x=+y*8;
        System.out.println(+y*8);  */



       /*Lecture_9...Q1
        float a=7/4.0f * 9/2.0f;
        System.out.println(a);  */



        /*Lecture_9...Q2
        char grade='A';
        grade=(char) (grade+8);
        System.out.println(grade);
        grade=(char) (grade-8);
        System.out.println(grade);    */



        /*Lecture_9...Q3
        int a=sc.nextInt();
        System.out.println(a>8);   */



        /*Lecture_9..Q4
        int v=21;
        int u=9;
        int a=7;
        int s=9;
        double equation=(v*v-u*u)/(4*a*s);
        System.out.println(equation);    */



        /*Lecture_9...Q5
        int a=7*49/7+35/7;
        System.out.println(a);   */



       /* String name=new String("Jarry");
        System.out.println(name);
        String nickname=new String("Harry");
        System.out.println(nickname);    */




        //ways to print in java
        /*to print in one line we use only print not println.
        String place="Nagpur";
        System.out.print("The place is :");
        System.out.println(place);
        */



        /*this is called as format specifier as we used in c and c++
        int a=4;
       float b=4.53f;
       System.out.printf("The value of a is %d and value of b is %f",a,b);
         */




        // Array: it is a collection of similar type of data elements.
        /*int [] marks=new int[5];
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;
        marks[3]=90;
        marks[4]=86;
        System.out.println(marks[3]);     */



        /*Array length integer
        int []marks={34,65,2,78,223};
        System.out.println(marks.length);     */



        /* Array length float
        float [] marks=new float[3];
        marks[0]=41.5f;
        marks[1]=56.7f;
        marks[2]=77.9f;
        System.out.println(marks.length);
        System.out.println(marks[1]);     */




        /*Array length string
        String[] students;
        students=new String[4];
        students[0]="Harry";
        students[1]="Jarry";
        students[2]="Tom";
        students[3]="Jungkook";
        System.out.println(students.length);
        System.out.println(students[0]);     */



        /* Display array using for loop
        int [] marks={ 98, 56, 33, 21,50};
        for(int i=0;i< marks.length;i++)
        {
            System.out.println(marks[i]);
        }   */



        /*Display array in reverse order
        int [] marks={ 98, 56, 33, 21,50};
        for(int i= marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }     */



        /* for each loop in array
        int [] marks={ 98, 56, 33, 21,50};
        for( int element:marks)
        {
            System.out.println(element);
        }    */




        // Multi-dimension arrays are array of arrays.
        // each element of multi dimension array is array itself.
        //2-D Array
        /*int [][] flats;
        flats= new int[2][3];
        flats [0][0]=101;
        flats [0][1]=102;
        flats [0][2]=103;
        flats [1][0]=201;
        flats [1][1]=202;
        flats [1][2]=203;
        System.out.println("Printing a 2D array");
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.println(flats[i][j]);
            }
            System.out.println(" ");
        }     */



/*
        // Practice set on Array
        // Q1: create array of 5 floats and print their sum.
        float [] array=new float[5];
        array[0]= 45.5f;
        array[1]= 33.8f;
        array[2]= 67.7f ;
        array[3]= 89.8f;
        array[4]=45.2f;
        float sum=0;
        System.out.println("The length of array is " +array.length);
        for(float element:array)
        {
            sum=sum+element;
        }
        System.out.println("The sum of float arrays is "+sum);
*/



      /*  System.out.println("Enter the size of array:");
        List<Integer> result = new ArrayList<>();

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        continueHere:
        for(int i=1; i<=n; i++){
            for(int ele: nums){
                if(ele == i){
                    continue continueHere;
                }
            }
            result.add(i);
        }
        for(int ele: result){
            System.out.print(" "+ele);
        }    */



     /*   Q1: input array elements and print them.
     int n= sc.nextInt();
     int[] array=new int[n];
     for(int i=0;i<n;i++)
     {
         array[i]=sc.nextInt();
     }
      for(int i=0;i<n;i++)
      {
          System.out.println(array[i]);
      }      */



        /* maximum no. from array
        int max=0;
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(array[i]>array[i+1]) {
                if(max<array[i]){
                    max = array[i];
                }
            }else{
                if(max<array[i+1]){
                    max = array[i+1];
                }
            }

        }
        System.out.println(max);
         */



         /* int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int max = array[0];
        for (int i=1; i<n; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
       */



        /* minimum in array
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int min=array[0];
        for (int i=1; i<n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
System.out.println(min);     */




        /* sum of all elements in array
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        int sum=0;
        for(int element:array)
        {
            sum=sum+element;
        }
        System.out.println(sum);
         */



        /* Reverse of array
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
           */



         /*  check if an element exist
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int value=sc.nextInt();
        for(int i=0;i<n;i++) {
            if (value == array[i]) {
                System.out.println("Found");

            }
        }
        */



       /*even odd
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]%2==0)
            {
              even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even count: "+even);
        System.out.println("Odd count: "+odd);
        */



        /* duplicate element in array
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int duplicate=array[0];
        for(int i=0;i<n;i++)
        {
            duplicate = array[i];
            for(int j=i+1; j<n; j++){
                if(array[j] == duplicate){
                    System.out.println(array[j]);
                }
            }
        }
         */



        /*  int []arr=new int[3];
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;

        if(arr[0]>arr[1] && arr[0]>arr[2])
        {
           temp=arr[0];
           arr[0]=arr[2];
           arr[2]=temp;

        }
        if(arr[0]>arr[1])
        {
            temp=arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }
        if(arr[1]>arr[2]){
            temp=arr[1];
            arr[1]=arr[2];
            arr[2]=temp;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);   */



/*
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        if(arr[0]>arr[1])
        {
            if(arr[0]>arr[2])
            {
                temp=arr[0];
                arr[0]=arr[2];
                arr[2]=temp;
            }
            else{
                temp=arr[0];
                arr[0]=arr[1];
                arr[1]=temp;
            }

        }
        else {
            if(arr[0]>arr[2])
            {
                temp=arr[0];
                arr[0]=arr[2];
                arr[2]=temp;
            }
            else {
                temp=arr[1];
                arr[1]=arr[2];
                arr[2]=temp;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*
        */



       /*
        double a,b,c;
        double temp;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        if(a<b)
        {
            temp=a;
            a=b;
            b=temp;
        }
        if(a<c)
        {
            temp=a;
            a=c;
            c=temp;
        }
        if(b<c)
        {
            temp=b;
            b=c;
            c=temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);   */



//        float a=sc.nextFloat();
//        float b=sc.nextFloat();
//        System.out.println("Addition = "+(a+b)+", Subtraction = "+(a-b)+", Multiplication = "+(a*b)+", Division = "+(a/b));

         /* int n = sc.nextInt();
        int[] nums = new int[n];
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            nums[i]  = sc.nextInt();
        }
//        ---------------------------------
        Integer k = 1;
        for (int e: nums){
            if(!k.equals(e)){
                result.add(e);
            }
            k++;
        }

        for (Integer e: result){
            System.out.println(e);
        }
          */



      /*   int a= sc.nextInt();
        int b=sc.nextInt();
        int c;
        Metjods obj=new Metjods();
       c=obj.logic(a,b);
        System.out.println(c);
      */



        /* String fn=sc.next();
        String ln=sc.next();
       Print_name obj=new Print_name();
       obj.PrintmyName(fn,ln);   */



        // Methods2.Tell_joke();



        /*
        Method_overloading.Foo();
        Method_overloading.Foo(8);
        Method_overloading.Foo(2,4,7);     */


        //System.out.println("The sum of 4 6 9 is: "+ sum( ...arr: 4, 6, 9));



         /* int []array=new int[5];
        array [0]=2;
       array [1]=5;
        array [2]=3;
        array [3]=7;
        array [4]=4;
        int num=1;
        boolean resultFound = true;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++)
            {
                if(array[i]+array[j]==num)
                {
                    resultFound = false;
                    System.out.println("the two numbers which on sum gives the given number are "+ array[i] + " "+array[j]);
                }

            }
        }

        if(resultFound){
            System.out.println("No result found.");
        }
          */



          /* System.out.println("This is our Main Class");
       Employee harry=new Employee();
       harry.name="code with harry";
       harry.id=101;
       System.out.println(harry.id);
       System.out.println(harry.name);
       harry.printDetail();     */



      /*  Employee2 harry=new Employee2();
       harry.setName("code with me");
       System.out.println(harry.getName());
        harry.salary=233;
        System.out.println(harry.getSalary());     */



      /*  Cellphone vivo=new Cellphone();
        vivo.ring();
        vivo.vibrate();   */


       /*
        Square sq=new Square();
        sq.side=2;
        System.out.println(sq.area());
       System.out.println( sq.perimeter());
        */


        /*
       Tommy_Vercitte tommy=new Tommy_Vercitte();
       tommy.hit();
       tommy.run();
       tommy.fire();
     */


     /*    My_Employee harry=new My_Employee();
      harry.setName("Code with me!");
      System.out.println(harry.getName());
      harry.setId(233);
      System.out.println(harry.getId());
     */


     Student st=new Student();
     st.name="Yasin";
     st.rollno=420;
     st.marks=450;
     st.displayDetails();
        

    }
}