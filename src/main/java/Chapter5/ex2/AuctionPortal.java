package Chapter5.ex2;



public class AuctionPortal {
    public static void main(String[] args) {
        Auction auction1 = new Auction();
        auction1.title = "Xbox One";
        auction1.description = "Console for players";
        auction1.price = 1000;
        auction1.seller = new Seller();
        auction1.seller.firstName = "Jan";
        auction1.seller.lastName = "Kennedy";
        auction1.seller.adress = new Adress1();
        auction1.seller.adress.street = "Legnicka";
        auction1.seller.adress.city = "Wroclaw";
        auction1.seller.adress.flatNumber = 10;
        auction1.seller.adress.homeNumber = 10;
        auction1.seller.adress.postalCode = "51-200";

        Auction auction2 = new Auction();
        auction2.title = "Samsung S20";
        auction2.description = "Super smartphone";
        auction2.price = 1222;
        auction2.seller = new Seller();
        auction2.seller.firstName = "Simon";
        auction2.seller.lastName = "Jenner";
        auction2.seller.adress = null;

    }




}
