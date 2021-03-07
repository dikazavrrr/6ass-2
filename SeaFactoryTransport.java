public class SeaFactoryTransport implements Factory{
    @Override
    public Transport factorytransport(){
        return new SeaTransport();
    }
}
