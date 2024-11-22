package petpals.impl;

import petpals.dao.Donation;

public class ItemDonation extends Donation{
	private String itemType;

    public ItemDonation(String donorName, double amount, String itemType) {
        super(donorName, amount);
        this.itemType = itemType;
    }

    @Override
    public void recordDonation() {
        System.out.println("Item donation recorded: " + this);
    }

    @Override
    public String toString() {
        return "ItemDonation [DonorName=" + donorName + ", Amount=" + amount + ", ItemType=" + itemType + "]";
    }
}
