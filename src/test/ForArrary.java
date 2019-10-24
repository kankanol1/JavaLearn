package test;

public class ForArrary {
    public static void main(String args[]){
       int [] numbers = {10,20,30,40,50};
       for(int x:numbers){
           if(x==30) continue;
           System.out.print(x+",");
       }
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name +",");
        }
    }
}
