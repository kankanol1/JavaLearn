package test;

public class Logger {
    private String format;
    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format = format;
    }
    public static void main(String[] arg){
        Logger myLogger = new Logger();
        myLogger.setFormat("kankan");
       System.out.println(myLogger.getFormat());
    }

}
