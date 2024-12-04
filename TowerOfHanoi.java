public class TowerOfHanoi {

    
    public static void solveHanoi(char source, char target, char auxiliary, int n) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
        } else {
            // Move n-1 disks from source to auxiliary
            solveHanoi(source, auxiliary, target, n - 1);
            
            solveHanoi(source, target, auxiliary, 1);
            
            solveHanoi(auxiliary, target, source, n - 1);
        }
    }

    public static void main(String[] args) {
        int numDisks = 4; // Change this number to solve for more disks
        solveHanoi('A', 'C', 'B', numDisks); 
    }
}
