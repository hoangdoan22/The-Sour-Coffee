package homeworkOOPday3_1;

import java.util.Scanner;

public class MainOOPday3_1 {
	public static void main(String[] args) {

		Customer customerDung = new Customer();
		customerDung.id = 001;
		customerDung.name = "Dung Nguyen";

		Customer customerJayden = new Customer();
		customerJayden.id = 002;
		customerJayden.name = "Jayden";

		Account accountDung = new Account();
		accountDung.id = 0001;
		accountDung.loginID = "dungidolgioitre";
		accountDung.password = "khongcomatkhau123";
		accountDung.customer = customerDung;

		Account accountJayden = new Account();
		accountJayden.id = 0002;
		accountJayden.loginID = "jayden123";
		accountJayden.password = "jayden@123";
		accountJayden.customer = customerDung;

		Customer[] customers = { customerDung, customerJayden };

		Account[] accounts = { accountDung, accountJayden };

		Brand brandTrungNguyen = new Brand();
		brandTrungNguyen.id = 101;
		brandTrungNguyen.name = "Trung Nguyen";

		Brand brandDaklak = new Brand();
		brandDaklak.id = 102;
		brandDaklak.name = "Daklak";

		Brand[] brands = { brandTrungNguyen, brandDaklak };

		Location locationHCM = new Location();
		locationHCM.id = 51;
		locationHCM.name = "HCM Warehouse";
		locationHCM.address = "Ho Chi Minh City";

		Location locationHN = new Location();
		locationHN.id = 29;
		locationHN.name = "HN Warehouse";
		locationHN.address = "Ha Noi City";

		Location locationDN = new Location();
		locationDN.id = 47;
		locationDN.name = "DN Warehouse";
		locationDN.address = "Da Nang City";

		Location[] locations = { locationHCM, locationHN, locationDN };

		Product productCFBlack = new Product();
		productCFBlack.id = 201;
		productCFBlack.brand = brandTrungNguyen;
		productCFBlack.name = "Black Coffee";
		productCFBlack.price = 3;
		productCFBlack.totalStock = 1000;

		Product productCFWhile = new Product();
		productCFWhile.id = 202;
		productCFWhile.brand = brandTrungNguyen;
		productCFWhile.name = "While Coffee";
		productCFWhile.price = 5;
		productCFWhile.totalStock = 2000;

		Product productCFBrown = new Product();
		productCFBrown.id = 203;
		productCFBrown.brand = brandDaklak;
		productCFBrown.name = "Brown Coffee";
		productCFBrown.price = 4;
		productCFBrown.totalStock = 3000;

		Product[] products = { productCFBlack, productCFWhile, productCFBrown };

		ProductInStock blackCoffeeHCM = new ProductInStock();
		blackCoffeeHCM.location = locationHCM;
		blackCoffeeHCM.product = productCFBlack;
		blackCoffeeHCM.quantity = 400;

		ProductInStock blackCoffeeHN = new ProductInStock();
		blackCoffeeHN.location = locationHN;
		blackCoffeeHN.product = productCFBlack;
		blackCoffeeHN.quantity = 300;

		ProductInStock blackCoffeeDN = new ProductInStock();
		blackCoffeeDN.location = locationDN;
		blackCoffeeDN.product = productCFBlack;
		blackCoffeeDN.quantity = 300;

		ProductInStock whileCoffeeHCM = new ProductInStock();
		whileCoffeeHCM.location = locationHCM;
		whileCoffeeHCM.product = productCFWhile;
		whileCoffeeHCM.quantity = 700;

		ProductInStock whileCoffeeHN = new ProductInStock();
		whileCoffeeHN.location = locationHN;
		whileCoffeeHN.product = productCFWhile;
		whileCoffeeHN.quantity = 900;

		ProductInStock whileCoffeeDN = new ProductInStock();
		whileCoffeeDN.location = locationDN;
		whileCoffeeDN.product = productCFWhile;
		whileCoffeeDN.quantity = 400;

		ProductInStock brownCoffeeHCM = new ProductInStock();
		brownCoffeeHCM.location = locationHCM;
		brownCoffeeHCM.product = productCFBrown;
		brownCoffeeHCM.quantity = 700;

		ProductInStock brownCoffeeHN = new ProductInStock();
		brownCoffeeHN.location = locationHN;
		brownCoffeeHN.product = productCFBrown;
		brownCoffeeHN.quantity = 900;

		ProductInStock brownCoffeeDN = new ProductInStock();
		brownCoffeeDN.location = locationDN;
		brownCoffeeDN.product = productCFBrown;
		brownCoffeeDN.quantity = 400;

		ProductInStock[] productInStocks = { blackCoffeeHCM, blackCoffeeHN, blackCoffeeDN, whileCoffeeHCM,
				whileCoffeeHN, whileCoffeeDN, brownCoffeeHCM, brownCoffeeHN, brownCoffeeDN };

		Order orderDung = new Order();
		orderDung.id = "000001";
		orderDung.date = "20/03/2023 15:35:06";
		orderDung.customer = customerDung;

		Order orderJayden = new Order();
		orderJayden.id = "000002";
		orderJayden.date = "22/03/2023 16:36:06";
		orderJayden.customer = customerJayden;

		Order[] orders = { orderDung, orderJayden };

		OrderDetail orderDungCFBlack = new OrderDetail();
		orderDungCFBlack.order = orderDung;
		orderDungCFBlack.product = productCFBlack;
		orderDungCFBlack.order.productPrice = productCFBlack.price;
		orderDungCFBlack.quantity = 3;
		orderDungCFBlack.subtotal = orderDungCFBlack.order.productPrice * orderDungCFBlack.quantity;

		OrderDetail orderDungCFWhile = new OrderDetail();
		orderDungCFWhile.order = orderDung;
		orderDungCFWhile.product = productCFWhile;
		orderDungCFWhile.order.productPrice = productCFWhile.price;
		orderDungCFWhile.quantity = 5;
		orderDungCFWhile.subtotal = orderDungCFWhile.order.productPrice * orderDungCFWhile.quantity;

		OrderDetail orderDJaydenCFBrown = new OrderDetail();
		orderDJaydenCFBrown.order = orderJayden;
		orderDJaydenCFBrown.product = productCFBrown;
		orderDJaydenCFBrown.order.productPrice = productCFBrown.price;
		orderDJaydenCFBrown.quantity = 1;
		orderDJaydenCFBrown.subtotal = orderDJaydenCFBrown.order.productPrice * orderDJaydenCFBrown.quantity;

		OrderDetail orderJaydenCFWhile = new OrderDetail();
		orderJaydenCFWhile.order = orderJayden;
		orderJaydenCFWhile.product = productCFWhile;
		orderJaydenCFWhile.order.productPrice = productCFWhile.price;
		orderJaydenCFWhile.quantity = 2;
		orderJaydenCFWhile.subtotal = orderJaydenCFWhile.order.productPrice * orderJaydenCFWhile.quantity;

		OrderDetail[] orderDetails = { orderDungCFBlack, orderDungCFWhile, orderDJaydenCFBrown, orderJaydenCFWhile };

		showAllOrders(orders, orderDetails);

	}

	public static void showAllOrders(Order[] orders, OrderDetail[] orderDetails) {
		for (Order order : orders) {
			System.out.println("Order code: " + order.id);
			System.out.println("Date: " + order.date);
			System.out.println("Customer " + order.customer.name);
			System.out.println("Products of the order: ");
			for (OrderDetail orderDetail : orderDetails) {
				if (order.id == orderDetail.order.id) {
					System.out.println(orderDetail.product.name + " - Quantity: " + orderDetail.quantity
							+ " - Price of product = $" + orderDetail.order.productPrice + " - Sub total = $"
							+ orderDetail.subtotal);
					order.total += orderDetail.subtotal;
				}
			}
			System.out.println("Total: $" + order.total);

			System.out.println("-----------------------");
		}
	}
}
