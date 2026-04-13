// GridItem Class
class GridItem {
    private String id;
    private String name;
    private int quantity;

    public GridItem(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void display() {
        System.out.println("Item: " + name + " | Qty: " + quantity);
    }
}

// Warehouse Class
class Warehouse {
    private GridItem[][] grid;
    private int rows, cols;

    public Warehouse(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new GridItem[rows][cols];
    }

    // Add Item
    public void addItem(int row, int col, GridItem item) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            grid[row][col] = item;
        } else {
            System.out.println("Invalid position!");
        }
    }

    // Search Item
    public void searchItem(String id) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] != null && grid[i][j].getId().equals(id)) {
                    System.out.println("✅ Found at Row: " + i + ", Column: " + j);
                    grid[i][j].display();
                    return;
                }

            }
        }
        System.out.println("❌ Item not found");
    }

    // Display Grid
    public void displayGrid() {
        System.out.println("\nWarehouse Layout:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] != null) {
                    System.out.print("[" + grid[i][j].getId() + "] ");
                } else {
                    System.out.print("[----] ");
                }

            }
            System.out.println();
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(5, 5);

        // Add sample items
        warehouse.addItem(0, 0, new GridItem("I101", "Laptop", 10));
        warehouse.addItem(1, 2, new GridItem("I102", "Phone", 25));
        warehouse.addItem(2, 3, new GridItem("I103", "Tablet", 15));

        // Display warehouse
        warehouse.displayGrid();

        // Search operations
        System.out.println("\nSearching for I102:");
        warehouse.searchItem("I102");

        System.out.println("\nSearching for I999:");
        warehouse.searchItem("I999");
    }
}