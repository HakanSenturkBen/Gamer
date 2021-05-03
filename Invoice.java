import java.sql.Date;

public class Invoice {
	private int id;
	private int invoiceNumber;
	private Date invoiceDate;
	private double invoiceTotal;
	
	public Invoice() {
	
	}

	public Invoice(int id, int invoiceNumber, Date invoiceDate, double invoiceTotal) {
		
		this.id = id;
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
		this.invoiceTotal = invoiceTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getInvoiceTotal() {
		return invoiceTotal;
	}

	public void setInvoiceTotal(double invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}
	

}
