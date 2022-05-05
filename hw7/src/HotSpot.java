import java.util.ArrayList;

/**
 * 抽象 火锅类
 * @author root
 *
 */
public abstract class HotSpot {

    protected String vegetable;
    protected String meat;
    protected String soupbase;
    protected ArrayList toppings = new ArrayList();

    /**
     * 准备菜、肉、火锅底料
     */
    public void prepare(){
        System.out.println("Preparing " + vegetable);
        System.out.println("Preparing " + meat);
        System.out.println("Preparing " + soupbase);
        for(int i = 0; i < toppings.size(); i++){
            System.out.println("  " + toppings.get(i));
        }
    }


}