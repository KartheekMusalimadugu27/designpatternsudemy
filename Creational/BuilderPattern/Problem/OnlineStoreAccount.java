public class OnlineStoreAccount {

    private Long id;
    private String name;
    private String address;
    private Long budget;
    private Long discountRate;

    public OnlineStoreAccount(Long id, String name, String address, Long budget, Long discountRate){
        this.id = id;
        this.name = name;
        this.address = address;
        this.budget = budget;
        this.discountRate = discountRate;
    }
}
