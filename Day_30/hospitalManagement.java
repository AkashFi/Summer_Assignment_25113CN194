import java.util.Scanner;


public class hospitalManagement {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 500;
        int[] id = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        String[] disease = new String[n];

        int count = 0;
        int choice;
        do {
            System.out.println("\n----Hospital Management System----");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patient");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add Patient
                    System.out.print("\nEnter Patient ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Age: ");
                    age[count] = sc.nextInt();

                    System.out.print("Enter Disease: ");
                    disease[count] = sc.nextLine();

                    count++;

                    System.out.println("Patient record added successfully.");
                    break;

                case 2:
                    // Display All Patient
                    if (count == 0) {
                        System.out.println("\nNo records found.");
                    } else {
                        System.out.println("\n----Patient Records----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nPatient " + (i + 1));
                            System.out.println("ID    : " + id[i]);
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Age   : " + age[i]);
                            System.out.println("Disease : " + disease[i]);
                        }
                    }
                    break;

                case 3:
                    // Search Patient
                    System.out.print("\nEnter Patient ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            found = true;

                            System.out.println("\n----Patient Details----");
                            System.out.println("ID    : " + id[i]);
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Age   : " + age[i]);
                            System.out.println("Marks : " + disease[i]);

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient not found.");
                    }

                    break;

                case 4:
                    // Update Patient Record
                    System.out.print("\nEnter Patient ID to update: ");
                    int updateId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == updateId) {
                            found = true;

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            age[i] = sc.nextInt();

                            System.out.print("Enter New Disease: ");
                            disease[i] = sc.nextLine();

                            System.out.println("Record updated successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient not found.");
                    }

                    break;

                case 5:
                    // Delete Patient Record
                    System.out.print("\nEnter Patient ID to delete: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == deleteId) {
                            found = true;

                            for (int j = i; j < count - 1; j++) {
                                id[j] = id[j + 1];
                                name[j] = name[j + 1];
                                age[j] = age[j + 1];
                                disease[j] = disease[j + 1];
                            }

                            count--;

                            System.out.println("Record deleted successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient not found.");
                    }

                    break;

                case 6:
                    System.out.println("\nThank you for using Patient Record Management System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}