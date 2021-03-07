public class RoadFactoryTransport implements Factory{
    @Override
    public Transport factorytransport(){
        return new RoadTransport();
    }
}
