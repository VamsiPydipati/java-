class computer{
    public void playmusic()
    {
        System.out.println("music playing.....");

    }
    public String getpen(int cost){
        return "pen";
    }
    
}
public class Demo{
    public static void main(String a[]){
        computer obj=new computer();
        obj.playmusic();
        String str=obj.getpen(12);
        System.out.println(str);

    }
}