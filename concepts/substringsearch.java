package sample;

public class substringsearch {
    public static void searchLeftToRight(char[][] arr, String searchStr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length - searchStr.length(); j++) {
                int k;
                for (k = 0; k < searchStr.length(); k++) {
                    if (arr[i][j + k] != searchStr.charAt(k)) {
                        break;
                    }
                }
                if (k == searchStr.length()) {
                    System.out.println("Substring \"" + searchStr + "\" found at row " + (i + 1) + ", column " + (j + 1) + " (left to right)");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Substring \"" + searchStr + "\" not found (left to right)");
        }
    }

    public static void searchTopToBottom(char[][] arr, String searchStr) {
        boolean found = false;
        for (int i = 0; i <= arr.length - searchStr.length(); i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int k;
                for (k = 0; k < searchStr.length(); k++) {
                    if (arr[i + k][j] != searchStr.charAt(k)) {
                        break;
                    }
                }
                if (k == searchStr.length()) {
                    System.out.println("Substring \"" + searchStr + "\" found at row " + (i + 1) + ", column " + (j + 1) + " (top to bottom)");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Substring \"" + searchStr + "\" not found (top to bottom)");
        }
    }

    public static void main(String[] args) {
        char[][] arr = {
            {'W', 'E', 'L', 'C', 'O'},
            {'M', 'E', 'T', 'O', 'O'},
            {'O', 'H', 'O', 'C', 'O'},
            {'t', 'o', 'o', 'R', 'A'},
            {'T', 'O', 'O', 'n', '\0'}
        };

        String searchStr = "too";

        searchLeftToRight(arr, searchStr);
        searchTopToBottom(arr, searchStr);
    }
}
