package petpals.impl;

import java.time.LocalDate;

import petpals.dao.Donation;

public class CashDonation extends Donation{
	private LocalDate donationDate;

    public CashDonation(String donorName, double amount, LocalDate donationDate) {
        super(donorName, amount);
        this.donationDate = donationDate;
    }

    @Override
    public void recordDonation() {
        System.out.println("Cash donation recorded: " + this);
    }

    @Override
    public String toString() {
        return "CashDonation [DonorName=" + donorName + ", Amount=" + amount + ", DonationDate=" + donationDate + "]";
    }
}
