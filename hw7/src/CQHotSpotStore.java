public class CQHotSpotStore extends  HotSpotStore{
    public  HotSpot createHotSpot(String type){
        if(type.equals("CQ")){
            return new CQHotSpot();
        }else{
            return null;
        }

    }
}
