class CNFE {
    public static void main(String[] args) {
        try {
            Class.forName("Animal");
            System.out.println("Animal class loaded");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Animal class not found");
        }
    }
}
