package com.example;
import net.sf.json.JSONObject;

/**
 * Java Application 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JSONObject jo = new JSONObject();
        jo.element("foo", "bar");
        System.out.println( "Reindex repos" + jo.toString() );
    }
}
