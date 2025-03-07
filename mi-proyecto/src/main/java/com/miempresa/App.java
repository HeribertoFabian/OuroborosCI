package com.miempresa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		System.out.println( "Hello World! desde rama 1" );
		System.out.println( "Hello World! desde rama 4" );
    }
	
	public static String dgetMessage(){
		Return "Hola desde feature 2";
	}
	
	public static String getMessage3(){
		Return "Este viene de la rama 3";
	}
}
