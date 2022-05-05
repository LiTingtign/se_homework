public class CDHotSpotStore extends HotSpotStore{
    public  HotSpot createHotSpot(String type){
        if(type.equals("CD")){
    return new CDHotSpot();
    }else{
            return null;
        }
    }
}
