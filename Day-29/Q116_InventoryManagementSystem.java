import java.util.Scanner;

class Q116_InventoryManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maximum number of products: ");
        int maxSize = sc.nextInt();

        String[] productNames = new String[maxSize];
        int[] productQuantity = new int[maxSize];
        double[] productPrice = new double[maxSize];
        int count = 0;

        int choice = 0;

        do
        {
            System.out.println("\n----- Inventory Management System -----");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Calculate Total Inventory Value");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                if (count == maxSize)
                {
                    System.out.println("Inventory is full");
                }
                else
                {
                    System.out.println("Enter product name: ");
                    String name = sc.next();

                    System.out.println("Enter quantity: ");
                    int qty = sc.nextInt();

                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();

                    productNames[count] = name;
                    productQuantity[count] = qty;
                    productPrice[count] = price;
                    count++;

                    System.out.println("Product added successfully");
                }
            }
            else if (choice == 2)
            {
                if (count == 0)
                {
                    System.out.println("No products in inventory");
                }
                else
                {
                    System.out.println("\nProduct Name\tQuantity\tPrice");
                    for (int i = 0; i < count; i++)
                    {
                        System.out.println(productNames[i] + "\t\t" + productQuantity[i] + "\t\t" + productPrice[i]);
                    }
                }
            }
            else if (choice == 3)
            {
                System.out.println("Enter product name to search: ");
                String searchName = sc.next();
                int pos = -1;

                for (int i = 0; i < count; i++)
                {
                    if (productNames[i].equalsIgnoreCase(searchName))
                    {
                        pos = i;
                    }
                }

                if (pos == -1)
                {
                    System.out.println("Product not found");
                }
                else
                {
                    System.out.println("Product Found:");
                    System.out.println("Name: " + productNames[pos]);
                    System.out.println("Quantity: " + productQuantity[pos]);
                    System.out.println("Price: " + productPrice[pos]);
                }
            }
            else if (choice == 4)
            {
                System.out.println("Enter product name to update: ");
                String updateName = sc.next();
                int pos = -1;

                for (int i = 0; i < count; i++)
                {
                    if (productNames[i].equalsIgnoreCase(updateName))
                    {
                        pos = i;
                    }
                }

                if (pos == -1)
                {
                    System.out.println("Product not found");
                }
                else
                {
                    System.out.println("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    productQuantity[pos] = newQty;
                    System.out.println("Quantity updated successfully");
                }
            }
            else if (choice == 5)
            {
                System.out.println("Enter product name to delete: ");
                String deleteName = sc.next();
                int pos = -1;

                for (int i = 0; i < count; i++)
                {
                    if (productNames[i].equalsIgnoreCase(deleteName))
                    {
                        pos = i;
                    }
                }

                if (pos == -1)
                {
                    System.out.println("Product not found");
                }
                else
                {
                    for (int i = pos; i < count - 1; i++)
                    {
                        productNames[i] = productNames[i + 1];
                        productQuantity[i] = productQuantity[i + 1];
                        productPrice[i] = productPrice[i + 1];
                    }
                    count--;
                    System.out.println("Product deleted successfully");
                }
            }
            else if (choice == 6)
            {
                double totalValue = 0;
                for (int i = 0; i < count; i++)
                {
                    totalValue = totalValue + (productQuantity[i] * productPrice[i]);
                }
                System.out.println("Total Inventory Value = " + totalValue);
            }
            else if (choice == 7)
            {
                System.out.println("Exiting Inventory System. Bye!");
            }
            else
            {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}