package LSP;

abstract class Subscription {
    public abstract void freeDownload();
    public abstract void noAdvertisements() throws Exception;
}

class ProSubscription extends Subscription
{
    public void freeDownload()
    {
        System.out.println("Free Downloading of songs is available");
    }
    public void noAdvertisements()
    {
        System.out.println("There are no advertisements");
    }

}

class PremiumSubscription extends Subscription
{
    private Exception exception;

    public void freeDownload()
    {
        System.out.println("Free Downloading of songs is available");

    }
    public void noAdvertisements() throws Exception {
        throw new Exception("error occured");
    }
}

public class Subscription1
{
    public static void main(String args[]) throws Exception {
        PremiumSubscription p=new PremiumSubscription();
        ProSubscription p2=new ProSubscription();
        p.freeDownload();
        p.noAdvertisements();
        p2.freeDownload();
        p2.noAdvertisements();
    }
}
