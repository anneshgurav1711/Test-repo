-------------------------------------Java Test-----------------------------
1)Explian:
1.public static void main(String[] args):
>public is a access specifier
>static is a non-access specifier
>void is a return type, void will not return anything
>main() is a method name
>String[] is a class which passes in command line argument array
>args is a arguments
>static is used because it allocates single copy in memory
>Main method is entry point of program jvm looks for static specifier for entry into program, here not necessary to create an object to a main method

2.Class and Object
>>>Class:
>Class is a blue print of object
>class is blue print in which object is being created
>class contains group of objects
>class syntax is public class{
							}

>>>Object:
>Its a real world entity which have states and behaviours is called object
>object is a real instance of class
>object ex:car having 
           states:color,brand,name,modle,year
		   behaviours:Move,transport,carryGoods
		   
3.JVM,JRE,JDK:
>>>JVM:
>JVM stands for Java Virtual Machine
>JVM will not physically exists
>JVM will provide runtime environment to execute bytecode
>JVM will having set of libraries to execute bytecode
>JVM tasks:
	1.Loads the bytecode
	2.Verifies the bytecode
	3.Executes the bytecode

>>>JRE
>JRE stands for Java Runtime Environment
>JRE will exists physically
>JRE contains JVM+Set of libraries
>JRE will provide runtime environment to the jvm to execute bytecode

>>>JDK
>JDK stands for Java Development Kit
>JDK contains JVM+JRE(Development tools like javadoc,compiler,etc) and set of libraries
>JDK will take responsibily to run the java program by providing runtime environment

2)Write a program to reverse a given number?
>>>
public class reverse{
	public static void main(String[] args){
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=-1;i<=n;i--){
			System.our.println(n);
		}
		System.out.println(n);
	}
}

3)Write a program to reverse a given string?
>>>
public class reverse{
	public static void main(String[] args){
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=-1;i<=n.length;i--){
			System.our.println(n);
		}
		System.out.println(n);
	}
}

4)Explian constructors and its types?
>>>Constructor:
>Its a special type of method which will have the constructor name as class name
>Constructor will not having return type 
>Constructor is like a method which is used to initialize the instance variable or objects
>By using constructor constructor chaining will be done.
>Constructor chaining means calling one constructor to another constructor
===>Types of Constructors:
1.Default constructor
2.Parameterized constructor

1//Default Constructor:
>Default constructor will give imlicitely or explicitely
>Default constructor will prvided by the compiler imlicitely and Explicitely means we have to provide No argument constructor
>Purpose of default constructor is to give default values to the instance variables or objects
>Its also help to chaining
>Default constructor is also called as no-argument constructor
>Syntax for Default constructor is public constructor_Name{
															}

2//Parameterized Constructor
>Parameterized constructor is use to initialize the instance variable or object
>parameterized constructor will have the parameters in paranthesis
>parameterized constructor will also used for constructor chaining

5)Difference between this keyword and this() method?
>>>This keyword:
>this keyword will points to current object
>this keyword will remove the conflict between instance variable and parameterized variable
>this keyword will help to call the variable form same class
>this keyword will used in method or constructor

>>>this() method:
>this method will used inside method.
>this method will help to connect one method to another
>this method will also help to connect one constructor to another constructor
>this method will helped for constructor chaining ,calling one constructor inside other

7)Why main method is static and explain method types?
>>>Main method is public static void main(String[] args)
>Main method is static because the main method will not need to create an object
>main method is entry point to program
>since main method is static the jvm will look for static mthod and helps to run the program
>>>Method Types:
>public static void main(String[] args)
>public static void main(String args[])
>static public void main(String[] args)
>public static void main(String... args)

8)Write a program to get the numbers from 1 to 100 which are multiples of 5 and 10?
>>>
public class bumber{
	public static void main(String[] args){
		int num=100;
		for(int i=1;i<=num;i++){
			if(num%5==0 && num%10==0){
				System.out.println(num);
			}
		}
	}
}

9)What do you know about java class loading?Explain java class loaders?
>>>JVM class loading:
>Class loaders will loads the static methods.
>Class loader will loads the class and its methods 
>looks for main method to load the class


10)Can we have private constructor and can can we load the constructor explain with one example?
>yes,we can have private constructors it will be accessed within the same class.
>But the constructor chaining will happens only in particular class
>it cannot be accesses outside the class.

11)Write a program to find the length of the array is present in a given array?
>>>
public class length{
	public static void main(String[] args){
		int n=[12,3,2,45,6,7,6];
		System.out.println("Size of an array::"+n.size);
	}
}

12)can we use instance variable inside the static method?
>>>Yes we can write.