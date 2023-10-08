package HomeWorkAIT.lesson31;

public class TestMarket {
    public static void main(String[] args) {
        Book garryPotter = new Book(1,"agarry Poter",34," prikluchenija junnogo volshebnika","Дж. К. Роулинг."," fentezy",1997);
        Book goreOtUma = new Book(2, "gore ot uma" , 1005, "Она описывает светское общество времён крепостного права и показывает жизнь 1813—1824 годов.","A.S.Griboedov","komedy",1825);
        Electronics televizor = new Electronics(3,"televizor",1500,"televizor s ploskim ekranom i dioganalju 60'","Sharp",24);
        Electronics stiralnajaMashina = new Electronics(4,"stiralnaja mashina",550,"stiraet avtomaticheski veshi","samsung",24);

        garryPotter.displayInfo();
        goreOtUma.displayInfo();
        televizor.displayInfo();
        stiralnajaMashina.displayInfo();
        System.out.println("_________Cart\uD83D\uDED2➕_____________");

        Cart cart = new Cart();
        cart.addProduct(garryPotter);
        cart.addProduct(goreOtUma);
        cart.addProduct(televizor);
        cart.addProduct(stiralnajaMashina);
        cart.displayCartContents();

        System.out.println("_________Cart\uD83D\uDED2total Price_____________");
        System.out.println("obshaja stoimost tovarov: " + cart.calculateTotal());

        //udalim televizor po id i poshitaem obshuju summu
        System.out.println("_________Cart\uD83D\uDED2➖_____________");
        cart.removeProduct(3);
        cart.displayCartContents();

        System.out.println("_________Cart\uD83D\uDED2total Price_____________");
        System.out.println("obshaja stoimost tovarov: " + cart.calculateTotal());

        System.out.println("_________Cart\uD83D\uDED2Discount 10% na id:4_____________");
        //Skidka na stiralnuju mashinu
        stiralnajaMashina.applyDiscount(10);
        cart.displayCartContents();

        System.out.println("_________Cart\uD83D\uDED2total Price_____________");
        System.out.println("Skidka na stiralnuju mashinu 10%" );
        System.out.println("obshaja stoimost tovarov: " + cart.calculateTotal());

        //Sortiruem po cene v reverse
        System.out.println("_________Cart\uD83D\uDED2Sort by Price_____________");
        cart.sortByPrice();
        cart.displayCartContents();
        //Sorteruem po imeni v reverse
        System.out.println("_________Cart\uD83D\uDED2Sort by Name_____________");
        cart.sortByName();
        cart.displayCartContents();
        //Sorteruem po ID
        System.out.println("_________Cart\uD83D\uDED2Sort by ID_____________");
        cart.sortById();
        cart.displayCartContents();




    }
}
