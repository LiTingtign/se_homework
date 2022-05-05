import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HotSpotStoreTest {
    @Test
    public void test(){
        HotSpotStore hotSpotStore=new CDHotSpotStore();
        hotSpotStore.orderHotSpot("CD");
        HotSpotStore hotSpotStore2=new CQHotSpotStore();
        hotSpotStore2.orderHotSpot("CQ");
    }

}