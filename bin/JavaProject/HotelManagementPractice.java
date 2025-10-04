            package bin.JavaProject;
            import java.util.*;
           
           
           
           
           
            //class and attibutes
            class Hotel {
                String[] menu = {"Pizza", "Burger", "Pasta", "Coke"};
                int[] prices = {250, 150, 200, 50};

                void showMenu() {
                    System.out.println("------ Hotel Menu ------");
                    for(int i = 0; i < menu.length; i++) {
                        System.out.println((i+1) + ". " + menu[i] + " - ₹" + prices[i]);
                    }
                }

                int calculateBill(int itemNumber, int quantity) {
                    return prices[itemNumber-1] * quantity;
                }
            }

            // Class representing a Customer
            class Customer {
                String name;
                ArrayList<String> orders = new ArrayList<>();
                int totalBill = 0;

                void placeOrder(Hotel hotel, int itemNumber, int quantity) {
                    String item = hotel.menu[itemNumber-1];
                    int bill = hotel.calculateBill(itemNumber, quantity);
                    orders.add(item + " x" + quantity + " = ₹" + bill);
                    totalBill += bill;
                    System.out.println(quantity + " " + item + "(s) added to order.");
                }

                void viewBill() {
                    System.out.println("------ Current Order ------");
                    for(String order : orders) {
                        System.out.println(order);
                    }
                    System.out.println("Total Bill: ₹" + totalBill);
                }

                void checkout() {
                    System.out.println("------ Final Bill ------");
                    viewBill();
                    orders.clear();
                    totalBill = 0;
                    System.out.println("Thank you for visiting!");
                }
            }

            // Main class
            public class HotelManagementPractice {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Hotel hotel = new Hotel();

                    System.out.println("Enter Customer Name:");
                    String customerName = sc.nextLine();
                    Customer customer = new Customer();
                    customer.name = customerName;

                    int choice;
                    do {
                        System.out.println("\nWelcome to the Hotel, " + customer.name);
                        System.out.println("1. Show Menu");
                        System.out.println("2. Place Order");
                        System.out.println("3. View Current Bill");
                        System.out.println("4. Checkout / Pay Bill");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        choice = sc.nextInt();

                        switch(choice) {
                            case 1:
                                hotel.showMenu();
                                break;
                            case 2:
                                System.out.print("Enter item number: ");
                                int item = sc.nextInt();
                                System.out.print("Enter quantity: ");
                                int qty = sc.nextInt();
                                customer.placeOrder(hotel, item, qty);
                                break;
                            case 3:
                                customer.viewBill();
                                break;
                            case 4:
                                customer.checkout();
                                break;
                            case 5:
                                System.out.println("Exiting. Have a nice day!");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                    } while(choice != 5);

                    sc.close();
                }
            }
