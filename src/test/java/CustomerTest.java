import dealership.Customer;
import dealership.SalesPerson;
import org.junit.Before;
import org.junit.Test;
import vehicles.Diesel;
import vehicles.Electric;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Electric electric;

    Diesel diesel;
    Customer customer;

    SalesPerson salesPerson;

    @Before
    public void before() {
        electric = new Electric("Prius",3000,"Electric", "Red", 80);
        diesel = new Diesel("Ford",2000,"Diesel", "Blue", 100);
        customer = new Customer("Jackie", 4000);
        salesPerson = new SalesPerson("Ted", 10000);
        salesPerson.addCarToGarage(electric);
        salesPerson.addCarToGarage(diesel);


    }
    @Test
    public void customerHasVehicle() {
        customer.buyCar(electric);
        assertEquals("Prius",  customer.getGarage().get(0).getModel());
    }

    @Test
    public void customerHasMoney() {
        assertEquals(4000, customer.getWallet());
    }

    @Test
    public void canBuy() {
        customer.removeMoneyFromWallet(electric);
        salesPerson.addMoneyToWallet(electric);
        salesPerson.removeCarFromGarage(electric);
        customer.addCarToGarage(electric);
        assertEquals(1000, customer.getWallet());
       // assertEquals(12400, salesPerson.getWallet());
        assertEquals("Prius",  customer.getGarage().get(0).getModel());
        assertEquals(1,  salesPerson.getGarage().size());
    }
    @Test
    public void getSalePrice() {
        assertEquals(2400, electric.getSalePrice(electric), 0.1);
    }
}
