public class Bird {

    protected static int referenceCount = 0;
    int a;

    

    public Bird() {
        System.out.println(referenceCount);
    }

    protected void fly(){System.out.print("Flap Flap:" + a);}

    static int getRefCount() {
        return referenceCount;
    }
}
