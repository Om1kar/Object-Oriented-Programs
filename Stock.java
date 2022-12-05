package StockAccountManagement;

public class Stock {
    private String stockName;
    private int numOfShare;
    private int sharePrice;
    private int totalValueOfShares;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(int nomOfShare) {
        this.numOfShare = nomOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalValueOfShares() {
        return totalValueOfShares;
    }

    public void setTotalValueOfShares(int totalValueOfShares, int sharePrice ) {
        this.totalValueOfShares = totalValueOfShares;
    }
}
