public class test2 {
    public static int diggWater(int axe){
        System.out.println("Digging done");
        int water =10*axe;
        return water;
    }
    public static void main(String[] args) {
        int water=diggWater(10);
        System.out.println(water);
    }
}
