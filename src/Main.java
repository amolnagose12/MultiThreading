import com.amol.World;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.start();


        for (;;){
            System.out.println(Thread.currentThread().getName());
        }


    }
}