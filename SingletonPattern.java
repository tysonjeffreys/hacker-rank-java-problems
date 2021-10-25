import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton {
    
    public String str;
    private static Singleton oneSingleton;
    private Singleton(){
    }

    public static Singleton getSingleInstance() {
	if(oneSingleton==null)
	    oneSingleton = new Singleton();
            return oneSingleton;    
    }
    
}

import java.util.*;
