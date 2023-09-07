public class GroupActivity3 {
    public static String center(String text, int len){

        int textLength = text.length();
        int halfText = (textLength/2);
        int start = (len/2)-halfText;
        int end = len-start-textLength;
        String centeredText = "";

        for (int i = 0; i < start; i++){
            centeredText += " ";
        }

        centeredText += text;

        for (int j = 0; j < end; j++){
            centeredText += " ";
        }

        return centeredText;
    }

    public static String printBorder(char symbol, int len){
        String border = "";

        for (int i = 0; i < len; i++){
            border += symbol;
        }

        return border;
    }

    public static void main(String[] args) throws Exception {
        int col1 = 20, col2 = 8, col3 = 8, col4 = 8, col5 = 8, total = col1 + col2 + col3 + col4 + col5 + 6;
        String tableBorder = (" "+printBorder('-',col1)+" "+printBorder('-',col2)+" "+printBorder('-',col3)+" "+printBorder('-',col4)+" "+printBorder('-',col5)+" ");

        System.out.println(printBorder('@',total)+"\n\n"+center("Worst-Case Time Scenario",total)+"\n\n"+center("Table by:",total)+"\n"+center("Carlos Miguel Castro",total)+"\n\n"+center("LBYCPA2-EQ3",total)+"\n\n"+printBorder('@',total)+"\n\n"+tableBorder);
        System.out.println("|"+center("DATA STRUCTURE",col1)+"|"+center("ACCESS",col2)+"|"+center("SEARCH",col3)+"|"+center("INSERT",col4)+"|"+center("DELETE",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Static Array",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Dynamic Array",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Singly-Linked List",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Doubly-Linked List",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Stack",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Queue",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Binary Search Tree",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
        System.out.println("|"+center("Hash Table",col1)+"|"+center("NULL",col2)+"|"+center("NULL",col3)+"|"+center("NULL",col4)+"|"+center("NULL",col5)+"|\n"+tableBorder);
    }
}
