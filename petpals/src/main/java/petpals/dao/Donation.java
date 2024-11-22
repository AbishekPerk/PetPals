package petpals.dao;

public abstract class Donation {
	protected String donorName;
    protected double amount;

    public Donation(String donorName, double amount) {
        if (amount < 10) throw new IllegalArgumentException("Minimum donation amount is $10.");
        this.donorName = donorName;
        this.amount = amount;
    }

    public abstract void recordDonation();
}
