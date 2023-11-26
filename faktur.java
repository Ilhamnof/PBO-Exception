class faktur extends barang implements pembayaran {
    private String invoiceNumber;
    private String customerName;

    public faktur(String invoiceNumber, String customerName, String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    
    @Override
    public double calculateTotal() {
        return getPrice() * getQuantity();
    }
}