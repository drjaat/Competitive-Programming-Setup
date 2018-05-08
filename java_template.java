/*
    ######  ######    #####  ######  ######  #####
    #    #  #    #      #    #    #  #    #    #
    #    #  # #  #      #    # ## #  # ## #    #
    #    #  #  #    #   #    #    #  #    #    #
    ######  #   #   # # #    #    #  #    #    #
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.StringTokenizer;
class Clone {
    static PrintStream p = System.out;
    
    public static void main(String args[] ) throws Exception {
        int n = ni(); 
        int arr[] =  inta(n);
        pia(arr);

    }



//-------------------------------------------------fast Method---------------------------------------------------------------\\
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    static StringTokenizer st;
    private static int[] inta(int n){
        int [] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
            return a;
    }
    private static long[] longa(long n){
    long[] a = new long[(int)n];
        for(int i = 0;i < n;i++)a[i] = nl();
            return a;
    }
    private static void pla(long[] a){
        for(int i = 0;i <a.length;i++)
            p.print(a[i]+" ");
    }
    private static void pia(int[] a){
        for(int i = 0;i <a.length;i++)
            p.print(a[i]+" ");
    }
    private static String n(){
        while (st == null || !st.hasMoreElements()){
            try{
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    private static int ni(){
        return Integer.parseInt(n());
    }

    private static long nl(){
        return Long.parseLong(n());
    }

    private static double nd(){
        return Double.parseDouble(n());
    }
    private static String nli(){
        String str = "";
        try{
            str = br.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }
//-------------------------------------------------fast Method---------------------------------------------------------------\\
} 
