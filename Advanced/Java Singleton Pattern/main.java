import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{

    private Singleton() { }
    
    public String str = "Helo I am singleton! Let me say hello world to you";
    
    private static Singleton instance = null;
    
    public static Singleton getSingleInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}