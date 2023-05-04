
public class NewTime {
    
    private int hour;
    private int minute;
    private int second;
    
    public NewTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
   
    @Override
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }

    @Override
    public boolean equals(Object obj)
    {
        return this == obj;
    }
    
    public static void main(String[] args)
    {
        NewTime a = new NewTime(21,30,20);
        NewTime b = new NewTime(12,35,21);
        System.out.println(a);
        System.out.println(b);
        a.equals(b);
    }
    
}
