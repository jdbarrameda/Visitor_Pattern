public class UnliCallTextPackage implements UnliCallTextOffer {
    @Override 
    public String showUnliCallTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " unlimited call & texts: " + (unliCallText ? "Yes" : "No");
    }
}
