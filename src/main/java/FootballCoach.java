public class FootballCoach implements Coach{

    private String name;
    private Address address;

    public FootballCoach(){

    }

    public FootballCoach(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String eatEgg() {
        return name + " eating cooked egg at" + address.getAddress();
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
