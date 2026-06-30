import java.util.Scanner;

class Q114_MenuDrivenArrayOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int choice = 0;

        do
        {
            System.out.println("\n----- Menu Driven Array Operations -----");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Calculate Sum");
            System.out.println("5. Calculate Average");
            System.out.println("6. Sort Array (Ascending)");
            System.out.println("7. Search Element");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("Array elements: ");
                for (int i = 0; i < n; i++)
                {
                    System.out.println(arr[i] + " ");
                }
            }
            else if (choice == 2)
            {
                int max = arr[0];
                for (int i = 1; i < n; i++)
                {
                    if (arr[i] > max)
                    {
                        max = arr[i];
                    }
                }
                System.out.println("Maximum element = " + max);
            }
            else if (choice == 3)
            {
                int min = arr[0];
                for (int i = 1; i < n; i++)
                {
                    if (arr[i] < min)
                    {
                        min = arr[i];
                    }
                }
                System.out.println("Minimum element = " + min);
            }
            else if (choice == 4)
            {
                int sum = 0;
                for (int i = 0; i < n; i++)
                {
                    sum = sum + arr[i];
                }
                System.out.println("Sum = " + sum);
            }
            else if (choice == 5)
            {
                int sum = 0;
                for (int i = 0; i < n; i++)
                {
                    sum = sum + arr[i];
                }
                double avg = (double) sum / n;
                System.out.println("Average = " + avg);
            }
            else if (choice == 6)
            {
                for (int i = 0; i < n - 1; i++)
                {
                    for (int j = 0; j < n - i - 1; j++)
                    {
                        if (arr[j] > arr[j + 1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Array sorted successfully");
            }
            else if (choice == 7)
            {
                System.out.println("Enter element to search: ");
                int key = sc.nextInt();
                int pos = -1;

                for (int i = 0; i < n; i++)
                {
                    if (arr[i] == key)
                    {
                        pos = i;
                    }
                }

                if (pos == -1)
                {
                    System.out.println("Element not found");
                }
                else
                {
                    System.out.println("Element found at index " + pos);
                }
            }
            else if (choice == 8)
            {
                System.out.println("Exiting. Bye!");
            }
            else
            {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}