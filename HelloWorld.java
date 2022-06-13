
public class HelloWorld {
    static int classlevel = 10;

    public static void main(String[] args){
        System.out.println(" before block " + classlevel);


    //this is how you can call block
        {
            int classLevel = 20;
            System.out.println(" inside block " + classLevel);

        }
        System.out.println(" outside block " + classlevel);
    }


}
