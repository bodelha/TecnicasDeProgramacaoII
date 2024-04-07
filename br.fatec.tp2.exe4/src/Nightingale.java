
public class Nightingale extends Bird {

    public Nightingale() { referenceCount++;
        System.out.println(referenceCount);
    }

    public static void main(String[] args) {
        System.out.print("Before: " + getRefCount());
        Nightingale florence = new Nightingale();
        System.out.print("    After: " + getRefCount());
        florence.fly();
    }

}