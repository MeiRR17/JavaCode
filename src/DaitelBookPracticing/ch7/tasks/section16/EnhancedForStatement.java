package src.DaitelBookPracticing.ch7.tasks.section16;

public class EnhancedForStatement{
    public static void main(String[] args){

        float total = 0.0f;

        for(String arg : args)
            total += Double.parseDouble(arg);

        System.out.println("Total: " + total);
    }
}
