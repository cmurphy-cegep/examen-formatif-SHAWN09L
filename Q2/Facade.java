/*
 * Copyright (c) 2024. Shawn Lahaie, tous droits réservés.
 * Créé le 2024-08-05 13 h 25
 */

public class OrderFacade {
	/**
	 * Complétez
	 */
	private final Stock stock;
	private final Payment payment;
	private final Shipping shipping;

	public OrderFacade() {
		/**
		 * Complétez */
		stock = new Stock();
		payment = new Payment();
		shipping = new Shipping();
	}

	public void placeOrder(String item, int quantity, String paymentDetails, String address) {
		/**
		 * Complétez */
		System.out.println("Placing order for: " + item);
		stock.checkStock(item, quantity);
		payment.processPayment(paymentDetails);
		shipping.arrangeShipping(item, quantity, address);
		System.out.println("Order placed successfully.");

	}
}
