public class BasketballCoach implements Coach{

    private String name;
    private Address address;

    public BasketballCoach(){}

    public BasketballCoach(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String eatEgg() {
        return name + " eating raw egg at " + address.getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
