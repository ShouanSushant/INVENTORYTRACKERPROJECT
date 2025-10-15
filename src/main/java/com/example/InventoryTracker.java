public class InventoryTracker {

    public static void main(String[] args) {
        System.out.println("Inventory Tracker Initialized");
    }

    // Method 1: Check stock level (unique version)
    public String checkStockLevel(int stock) {
        if (stock > 50) {
            return "Stock level is healthy: " + stock + " items available.";
        } else if (stock > 0) {
            return "Limited stock remaining: " + stock + " items left.";
        } else {
            return "Out of stock!";
        }
    }

//     // Method 2: Low stock alert
//     public void alertLowStock(int stock) {
//         if (stock < 5) {
//             System.out.println("Warning: Low stock! Only " + stock + " items left.");
//         } else {
//             System.out.println("Stock level is sufficient.");
//         }
//     }
// }
