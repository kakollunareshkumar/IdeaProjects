// Java program to illustrate the
// concept of Multilevel inheritance
import java.util.*;
import java.lang.*;
import java.io.*;

class one
{
	one()
	{
		System.out.println("called one  default constructor");
	}

	public void print_geek()
	{
		System.out.println("Geeks");
	}
}

class two extends one
{

	two()
	{
		System.out.println("called two default constructor");
	}
	public void print_for()
	{
		System.out.println("for");
	}
}

class three extends two
{
	three()
	{
		System.out.println("called three default constructor");
	}
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}

// Drived class
public class Main
{
	public static void main(String[] args)
	{
		three g = new three();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}
