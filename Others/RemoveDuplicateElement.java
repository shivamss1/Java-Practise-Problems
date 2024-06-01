public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 2, 2, 1, 3 };

        int b[] = new int[a.length];
        int c = 0;
        boolean duplicate;
        for (int i = 0; i < a.length; i++) {
            duplicate = false;
            for (int j = 0; j < c; j++) {
                if (a[i] == b[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                b[i] = a[i];
                c++;
            }
        }
        int trimarr[] = new int[c];
        System.arraycopy(b, 0, trimarr, 0, c);
        for (int i = 0; i < trimarr.length; i++) {
            System.out.println(trimarr[i]);
        }

    }
}
