public abstract class HotSpotStore {

             public HotSpot orderHotSpot(String type){
                 HotSpot hotSpot;

                 hotSpot = createHotSpot(type);

                 hotSpot.prepare();
                return hotSpot;
             }

           /**
       * 具体类型的火锅
      * @param type
     * @return
      */
   public abstract HotSpot createHotSpot(String type);
}
