package models;

import java.util.Date;

public class BorrowRecord {

    private Date startDate;
    private Date endDate;
    private int borrowedDuration;
    private float amountToPay;
    String userId;
    String bookId;

    public BorrowRecord(Date startDate, Date endDate,String userId,String bookId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.borrowedDuration = 0;
        this.amountToPay = 0;
        this.userId=userId;
        this.bookId=bookId;

    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(float amountToPay) {
        this.amountToPay = amountToPay;
    }
}
