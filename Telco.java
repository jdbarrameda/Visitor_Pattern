public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price){
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText){
        return unliPackage.showUnliCallTextOffer(telcoName, unliCallText);
    }

    @Override
    public String getTelcoName(){
        return telcoName;
    }

    @Override
    public double getPromoPrice(){
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText(){
        return unliCallText;
    }
}